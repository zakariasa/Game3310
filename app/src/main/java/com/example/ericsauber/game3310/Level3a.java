package com.example.ericsauber.game3310;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Level3a extends AppCompatActivity {
    int score;
    int lives;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3a);
        Intent extras = getIntent();
        score = extras.getIntExtra("score", 1);
        lives = extras.getIntExtra("lives", 1);
    }

    public void gotoLevel3b(View view) {

        Intent intent = new Intent(this, Level3b.class);
        intent.putExtra("score", score);
        intent.putExtra("lives", lives);
        startActivity(intent);
        finish();
    }
}
