package com.example.ayush.singletondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button switchActivity = (Button) findViewById(R.id.button_switch_activity);
        switchActivity.setOnClickListener(this);

        //get Singleton instance
        Singleton singleton = Singleton.getInstance();

        //show the string value defined by the private constructor of Singleton class
        Toast.makeText(getApplicationContext(), singleton.getString(), Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }
}
