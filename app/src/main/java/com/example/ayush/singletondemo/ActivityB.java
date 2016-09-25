package com.example.ayush.singletondemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        //get Singleton instance
        Singleton singleton = Singleton.getInstance();

        //set string to a different value
        singleton.setString("World!");

        //show the string value of the singleton
        Toast.makeText(getApplicationContext(), singleton.getString(), Toast.LENGTH_LONG).show();
    }
}
