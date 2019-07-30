package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class SportingAndBikesScreenAcitivty extends AppCompatActivity {

    LinearLayout lineaelayout_sporting_goods,lineaelayout_bikes,lineaelayout_outdoor_equipment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spoting_goods_screen_acitivty);

        lineaelayout_sporting_goods = findViewById(R.id.lineaelayout_sporting_goods);
        lineaelayout_bikes = findViewById(R.id.lineaelayout_bikes);
        lineaelayout_outdoor_equipment = findViewById(R.id.lineaelayout_outdoor_equipment);

        lineaelayout_sporting_goods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_bikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_outdoor_equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });

    }

    private void IntentActivity() {

        Intent intent = new Intent(SportingAndBikesScreenAcitivty.this, AdDetaisActivity.class);
        startActivity(intent);
    }
}
