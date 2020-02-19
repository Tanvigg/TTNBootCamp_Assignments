package java2;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        System.out.println("Enter Table Type");
        q9_table table = null;
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if (str.equals("wooden")) {
            table = new q9_woodenTable();
        } else if (str.equals("metal")) {
            table = new q9_metalTable();
        }

        System.out.println(table.tableType());
        table.stressTest();
        table.fireTest();

        System.out.println("Enter Chair Type");
        q9_chair chair = null;
        Scanner input1 = new Scanner(System.in);
        String str1 = input.next();
        if (str1.equals("wooden")) {
            chair = new q9_woodenChair();

        } else if (str1.equals("metal")) {
            chair = new q9_metalChair();
        }

        System.out.println(chair.chairType());
        chair.stressTest();
        chair.fireTest();


    }
}