package com.example.livedata;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.livedata.data.User;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private UserViewModel userViewModel;
    public static final int ADD_USER_REQUEST = 1;
    public static final int EDIT_USER_REQUEST = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final FloatingActionButton addUser = findViewById(R.id.button_add_user);
        addUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddUserActivity.class);
                startActivityForResult(intent, ADD_USER_REQUEST);

            }
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        final UserAdapter adapter = new UserAdapter();
        recyclerView.setAdapter(adapter);
        userViewModel = ViewModelProviders.of(this).get(UserViewModel.class);
        userViewModel.getAllUsers().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {
                adapter.setData(users);
            }
        });

        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {

            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                userViewModel.delete(adapter.getUserAt(viewHolder.getAdapterPosition()));

                Toast.makeText(MainActivity.this, "User deleted", Toast.LENGTH_SHORT).show();

            }
        }).attachToRecyclerView(recyclerView);

        adapter.setOnItemClickListener(new UserAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(User user) {
                Intent intent = new Intent(MainActivity.this, AddUserActivity.class);
                intent.putExtra(AddUserActivity.EXTRA_ID, user.getId());
                intent.putExtra(AddUserActivity.EXTRA_NAME, user.getName());
                intent.putExtra(AddUserActivity.EXTRA_EMAIL, user.getEmail());
                intent.putExtra(AddUserActivity.EXTRA_PHONE, user.getPhone());
                startActivityForResult(intent, EDIT_USER_REQUEST);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == ADD_USER_REQUEST && resultCode == RESULT_OK) {
            String name = data.getStringExtra(AddUserActivity.EXTRA_NAME);
            String email = data.getStringExtra(AddUserActivity.EXTRA_EMAIL);
            String phone = data.getStringExtra(AddUserActivity.EXTRA_PHONE);

            User user = new User(name, email, phone);
            userViewModel.insert(user);
            Toast.makeText(this, "user saved", Toast.LENGTH_SHORT).show();


        } else if (requestCode == EDIT_USER_REQUEST && resultCode == RESULT_OK) {
            int id = data.getIntExtra(AddUserActivity.EXTRA_ID, -1);

            if (id == -1) {
                Toast.makeText(this, "User can't be updated", Toast.LENGTH_SHORT).show();
            }
            String name = data.getStringExtra(AddUserActivity.EXTRA_NAME);
            String email = data.getStringExtra(AddUserActivity.EXTRA_EMAIL);
            String phone = data.getStringExtra(AddUserActivity.EXTRA_PHONE);

            User user = new User(name, email, phone);
            user.setId(id);
            userViewModel.update(user);
            Toast.makeText(this, "User Updated", Toast.LENGTH_SHORT).show();


        } else {
            Toast.makeText(this, "User not saved", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.deleteAll:
                userViewModel.deleteAllUsers();
                Toast.makeText(this, "All Users Deleted", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);


        }
    }
}
