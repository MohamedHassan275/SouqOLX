package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class KidsScreenActivity extends AppCompatActivity {

    LinearLayout lineaelayout_clothes_kids_babies,lineaelayout_toys,lineaelayout_cribs_strollers,
            lineaelayout_accessories, lineaelayout_others_kids_babies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_screen);

        lineaelayout_clothes_kids_babies = findViewById(R.id.lineaelayout_clothes_kids_babies);
        lineaelayout_toys = findViewById(R.id.lineaelayout_toys);
        lineaelayout_cribs_strollers = findViewById(R.id.lineaelayout_cribs_strollers);
        lineaelayout_accessories = findViewById(R.id.lineaelayout_accessories);
        lineaelayout_others_kids_babies = findViewById(R.id.lineaelayout_others_kids_babies);

        lineaelayout_clothes_kids_babies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_toys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_cribs_strollers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_accessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_others_kids_babies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });

    }

    private void IntentActivity() {

        Intent intent = new Intent(KidsScreenActivity.this, AdDetaisActivity.class);
        startActivity(intent);
    }
}
