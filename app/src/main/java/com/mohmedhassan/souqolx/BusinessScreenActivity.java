package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class BusinessScreenActivity extends AppCompatActivity {

    LinearLayout lineaelayout_factories_equipment,lineaelayout_medical_equipment,lineaelayout_heavy_equipment,
            lineaelayout_restaurants_equipment,lineaelayout_shops_liquidation,lineaelayout_other_business_industrial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_screen);

        lineaelayout_factories_equipment = findViewById(R.id.lineaelayout_factories_equipment);
        lineaelayout_medical_equipment = findViewById(R.id.lineaelayout_medical_equipment);
        lineaelayout_heavy_equipment = findViewById(R.id.lineaelayout_heavy_equipment);
        lineaelayout_restaurants_equipment = findViewById(R.id.lineaelayout_restaurants_equipment);
        lineaelayout_shops_liquidation = findViewById(R.id.lineaelayout_shops_liquidation);
        lineaelayout_other_business_industrial = findViewById(R.id.lineaelayout_other_business_industrial);

        lineaelayout_factories_equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BusinessScreenActivity.this, AdDetaisActivity.class);
                startActivity(intent);
            }
        });
        lineaelayout_medical_equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BusinessScreenActivity.this, AdDetaisActivity.class);
                startActivity(intent);
            }
        });
        lineaelayout_heavy_equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BusinessScreenActivity.this, AdDetaisActivity.class);
                startActivity(intent);
            }
        });
        lineaelayout_restaurants_equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BusinessScreenActivity.this, AdDetaisActivity.class);
                startActivity(intent);
            }
        });
        lineaelayout_shops_liquidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BusinessScreenActivity.this, AdDetaisActivity.class);
                startActivity(intent);
            }
        });
        lineaelayout_other_business_industrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(BusinessScreenActivity.this, AdDetaisActivity.class);
                startActivity(intent);
            }
        });
    }
}
