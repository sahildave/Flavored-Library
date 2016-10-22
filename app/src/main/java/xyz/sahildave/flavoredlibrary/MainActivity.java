package xyz.sahildave.flavoredlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import xyz.sahildave.mylibrary.LibraryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, LibraryActivity.class);
        intent.putExtra("APK_FLAVOR", BuildConfig.FLAVOR);
        intent.putExtra("APK_APP_ID", BuildConfig.APPLICATION_ID);
        startActivity(intent);
        finish();
    }
}
