package com.image.get.demo_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fish);
        final ImageView fishImage = (ImageView) findViewById(R.id.image);
        fishImage.setImageResource(R.drawable.image);
        if (savedInstanceState != null) {
            onRestoreInstanceState(savedInstanceState);
        }
    }

}
