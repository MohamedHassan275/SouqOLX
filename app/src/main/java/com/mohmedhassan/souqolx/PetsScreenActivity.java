package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class PetsScreenActivity extends AppCompatActivity {

    LinearLayout lineaelayout_cats,lineaelayout_dogs,lineaelayout_horses,lineaelayout_fishes,lineaelayout_birds,lineaelayout_other_pets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets_screen);

        lineaelayout_cats = findViewById(R.id.lineaelayout_cats);
        lineaelayout_dogs = findViewById(R.id.lineaelayout_dogs);
        lineaelayout_horses = findViewById(R.id.lineaelayout_horses);
        lineaelayout_fishes = findViewById(R.id.lineaelayout_fishes);
        lineaelayout_birds = findViewById(R.id.lineaelayout_birds);
        lineaelayout_other_pets = findViewById(R.id.lineaelayout_other_pets);

        lineaelayout_cats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_dogs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_horses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_fishes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_birds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_other_pets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });


    }

    private void IntentActivity() {

        Intent intent = new Intent(PetsScreenActivity.this, AdDetaisActivity.class);
        startActivity(intent);
    }
}
