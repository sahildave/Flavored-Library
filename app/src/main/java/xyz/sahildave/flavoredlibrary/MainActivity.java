package xyz.sahildave.flavoredlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import xyz.sahildave.mylibrary.LibraryConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.textView)).setText("App: "+BuildConfig.APP_VERSION+"\nType: "+ BuildConfig.BUILD_TYPE + "\nLibrary: "+LibraryConfig.getType());
    }
}
