package com.buildbox.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import croco.fruirt.ninja.run.R;

public class MainActivity extends AppCompatActivity {

    private Button mLunchActivityBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLunchActivityBtn = findViewById(R.id.luncherActivityButton);

        mLunchActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PTPlayerIntent = new Intent(MainActivity.this, PTPlayer.class);
                startActivity(PTPlayerIntent);
            }
        });
    }
}
