package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class CarsVehiclesScreenActitvity extends AppCompatActivity {

    LinearLayout linearlayout_car_honda,linearlayout_car_bmw_car,linearlayout_car_ferrari_car,linearlayout_car_byd_car,linearlayout_car_fait_car,
            linearlayout_car_geely_car,linearlayout_car_faw_car,linearlayout_car_audi_car,linearlayout_car_ford_car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars_vehicles_screen_actitvity);

        linearlayout_car_honda = findViewById(R.id.linearlayout_car_honda);
        linearlayout_car_bmw_car = findViewById(R.id.linearlayout_car_bmw_car);
        linearlayout_car_ferrari_car = findViewById(R.id.linearlayout_car_ferrari_car);
        linearlayout_car_byd_car = findViewById(R.id.linearlayout_car_byd_car);
        linearlayout_car_fait_car = findViewById(R.id.linearlayout_car_fait_car);
        linearlayout_car_geely_car = findViewById(R.id.linearlayout_car_geely_car);
        linearlayout_car_faw_car = findViewById(R.id.linearlayout_car_faw_car);
        linearlayout_car_audi_car = findViewById(R.id.linearlayout_car_audi_car);
        linearlayout_car_ford_car = findViewById(R.id.linearlayout_car_ford_car);

        linearlayout_car_honda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linearlayout_car_bmw_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linearlayout_car_ferrari_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linearlayout_car_byd_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linearlayout_car_fait_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linearlayout_car_geely_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linearlayout_car_faw_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linearlayout_car_audi_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        linearlayout_car_ford_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });


    }

    private void IntentActivity() {

        Intent intent = new Intent(CarsVehiclesScreenActitvity.this, AdDetaisActivity.class);
        startActivity(intent);
    }
}
