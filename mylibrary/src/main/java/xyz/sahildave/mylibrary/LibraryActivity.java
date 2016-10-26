package xyz.sahildave.mylibrary;

import android.os.Bundle;
import android.widget.TextView;

public class LibraryActivity extends FlavoredActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((TextView) findViewById(R.id.content_text_view))
                .setText(generateLibraryText());

    }

    @Override
    String generateLibraryText() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n------LIBRARY--------");
        builder.append("\nFlavor : ").append(BuildConfig.FLAVOR);
        builder.append("\nBuild_Type: ").append(BuildConfig.BUILD_TYPE);
        builder.append("\nLibrary: ").append(LibraryConfig.getType());
        builder.append("\n\n------APP--------");
        builder.append("\nActivity Type: ").append(FlavoredActivity.class.getSuperclass());
        builder.append("\nFlavor: ").append(getIntent().getStringExtra("APK_FLAVOR"));
        builder.append("\nApplication_ID: ").append(getIntent().getStringExtra("APK_APP_ID"));

        return builder.toString();
    }
}
