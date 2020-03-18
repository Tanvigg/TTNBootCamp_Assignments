package com.example.asynctaskasses;

import android.app.IntentService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.icu.util.BuddhistCalendar;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.ParcelUuid;
import android.webkit.URLUtil;

import androidx.annotation.Nullable;

public class DownloadImageService extends IntentService {
    /**
     * Debugging tag used by the Android logger.
     */
    private final String TAG = getClass().getSimpleName();

    /**
     * String constant used to extract the Messenger "extra" from an
     * intent.
     */
    private static final String MESSANGER = "MESSANGER";

    /**
     * String constant used to extract the pathname to a downloaded
     * image from a Bundle.
     */
    private static final String IMAGE_PATHNAME = "IMAGE_PATHNAME";

    /**
     * String constant used to extract the request code.
     */
    private static final String REQUEST_CODE = "REQUEST_CODE";

    /**
     * String constant used to extract the URL to an image from a
     * Bundle.
     */
    private static final String IMAGE_URL = "IMAGE_URL";

    /**
     * String constant used to extract the directory pathname to use
     * to store a downloaded image.
     */
    private static final String DIRECTORY_PATHNAME = "DIRECTORY_PATHNAME";

    public DownloadImageService() {
        super("DownloadImageService");
    }


    public static Intent makeIntent(Context context, int requestCode, Uri url, String directoryPathname, Handler downloadHandler) {

        //Create an intent that will download the image from the web.
        Intent intent = new Intent(context, DownloadImageService.class);
        intent.setData(url);
        intent.putExtra(MESSANGER, new Messenger(downloadHandler));
        intent.putExtra(DIRECTORY_PATHNAME, directoryPathname);
        return intent;


    }


    /**
     * Helper method that returns the path to the image file if it is
     * download successfully.
     */

    public static String getImagePathname(Bundle data) {
        return data.getString(IMAGE_PATHNAME);

    }


    public static int getResultCode(Message message) {
        return message.arg1;
    }

    /**
     * Helper method that returns the request code associated with
     * the @a message.
     */

    public static int getRequestCode(Message message) {
        Bundle data = message.getData();
        return data.getInt(REQUEST_CODE);

    }


    /**
     * Helper method that returns the URL to the image file.
     */
    public static String getImageURL(Bundle data) {
        return data.getString(IMAGE_URL);


    }


    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        final Uri uri = intent.getData();

        final String directoryPath  = (String) intent.getExtras().get(DIRECTORY_PATHNAME);

    }
}
