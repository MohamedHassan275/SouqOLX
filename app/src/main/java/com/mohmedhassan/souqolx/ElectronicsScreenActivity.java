package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class ElectronicsScreenActivity extends AppCompatActivity {

    LinearLayout lineaelayout_audio_video,lineaelayout_computer_tablets,lineaelayout_video_games_consoles,
            lineaelayout_cameras_imaging,lineaelayout_home_appliances;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics_screen);

        lineaelayout_audio_video = findViewById(R.id.lineaelayout_audio_video);
        lineaelayout_computer_tablets = findViewById(R.id.lineaelayout_computer_tablets);
        lineaelayout_video_games_consoles = findViewById(R.id.lineaelayout_video_games_consoles);
        lineaelayout_cameras_imaging = findViewById(R.id.lineaelayout_cameras_imaging);
        lineaelayout_home_appliances = findViewById(R.id.lineaelayout_home_appliances);

        lineaelayout_audio_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_computer_tablets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_video_games_consoles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_cameras_imaging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();

            }
        });
        lineaelayout_home_appliances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });

    }

    private void IntentActivity() {

        Intent intent = new Intent(ElectronicsScreenActivity.this, AdDetaisActivity.class);
        startActivity(intent);
    }
}
