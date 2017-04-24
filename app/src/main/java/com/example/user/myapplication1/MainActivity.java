package com.example.user.myapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String msg = "Android : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.imageView4);
        imageView.setImageResource(R.drawable.image);
        TextView msgTextView = (TextView) findViewById(R.id.msg);
        msgTextView.setText(R.string.hello);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        EditText e = (EditText)findViewById(R.id.edit);
            e.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    return false;
                }
            });
    }
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The onStart() event");

    }
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The onResume() event");
    }
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The onPause() event");
    }
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The onStop() event");
    }
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The onDestroy() event");
    }
    public void startService(View view) {
        startService(new Intent(getBaseContext(), Myservice.class));
    }
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), Myservice.class));
    }


}
