package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class VehiclesActivity extends AppCompatActivity {

    LinearLayout linerlayout_CarsVihicles,linerlayout_boats,linerlayout_car_accessories,linerlayout_motorecycles,
            linerlayout_other_vehicles,linerlayout_spare_parts,linerlayout_trucks_buses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicles);

        linerlayout_CarsVihicles = findViewById(R.id.linerlayout_CarsVihicles);
        linerlayout_boats = findViewById(R.id.linerlayout_boats);
        linerlayout_car_accessories = findViewById(R.id.linerlayout_car_accessories);
        linerlayout_motorecycles = findViewById(R.id.linerlayout_motorecycles);
        linerlayout_other_vehicles = findViewById(R.id.linerlayout_other_vehicles);
        linerlayout_spare_parts = findViewById(R.id.linerlayout_spare_parts);
        linerlayout_trucks_buses = findViewById(R.id.linerlayout_trucks_buses);

        linerlayout_CarsVihicles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(VehiclesActivity.this, CarsVehiclesScreenActitvity.class);
                startActivity(intent);
            }
        });
        linerlayout_boats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linerlayout_car_accessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linerlayout_motorecycles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linerlayout_other_vehicles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linerlayout_spare_parts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linerlayout_trucks_buses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });

    }

    private void IntentActivity() {

        Intent intent = new Intent(VehiclesActivity.this, AdDetaisActivity.class);
        startActivity(intent);
    }
}
