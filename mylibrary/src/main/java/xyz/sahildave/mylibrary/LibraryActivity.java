package xyz.sahildave.mylibrary;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                // TODO: 22/10/16 Intent open Medium
            }
        });

        StringBuilder builder = new StringBuilder();
        builder.append("\n------LIBRARY--------");
        builder.append("\nFlavor : ").append(BuildConfig.FLAVOR);
        builder.append("\nBuild_Type: ").append(BuildConfig.BUILD_TYPE);
        builder.append("\nLibrary: ").append(LibraryConfig.getType());
        builder.append("\n\n------APP--------");
        builder.append("\nFlavor: ").append(getIntent().getStringExtra("APK_FLAVOR"));
        builder.append("\nApplication_ID: ").append(getIntent().getStringExtra("APK_APP_ID"));


        ((TextView) findViewById(R.id.content_text_view))
                .setText(builder.toString());

    }

}
