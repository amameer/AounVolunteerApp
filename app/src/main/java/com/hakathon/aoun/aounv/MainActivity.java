package com.hakathon.aoun.aounv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button clickButton = (Button) findViewById(R.id.loginButton);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent login = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(login);
            }
        });



    }
}
