package com.example.ericsauber.game3310;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Level2c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2c);
    }

    public void gotoLevel2d(View view) {

        Intent intent = new Intent(this, Level2d.class);
        startActivity(intent);
    }
}
