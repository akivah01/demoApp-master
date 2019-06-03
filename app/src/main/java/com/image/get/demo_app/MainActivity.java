package com.image.get.demo_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    private Button fishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        textView = (TextView)findViewById(R.id.textView);
        fishButton = (Button)findViewById(R.id.fish);

        if (savedInstanceState!= null){
            onRestoreInstanceState(savedInstanceState);
        }
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent digits = new Intent(MainActivity.this, Screen3.class);
                startActivityForResult(digits, 1);

            }
        });
        fishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fisherMan = new Intent(MainActivity.this, Screen2.class);
                startActivity(fisherMan);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String result = data.getStringExtra("result");
                textView.setText("you have entered: " + result);
            }
        }
    }
}
