package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class FashionsAndBeautyScreenActivity extends AppCompatActivity {

    LinearLayout lineaelayout_clothing_accessories,lineaelayout_jewelry_watches,lineaelayout_health_beauty_cosmetics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashions_and_beauty_screen);

        lineaelayout_clothing_accessories = findViewById(R.id.lineaelayout_clothing_accessories);
        lineaelayout_jewelry_watches = findViewById(R.id.lineaelayout_jewelry_watches);
        lineaelayout_health_beauty_cosmetics = findViewById(R.id.lineaelayout_health_beauty_cosmetics);

        lineaelayout_clothing_accessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FashionsAndBeautyScreenActivity.this, AdDetaisActivity.class);
                startActivity(intent);
            }
        });
        lineaelayout_jewelry_watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_health_beauty_cosmetics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });

    }

    private void IntentActivity() {

        Intent intent = new Intent(FashionsAndBeautyScreenActivity.this, AdDetaisActivity.class);
        startActivity(intent);
    }
}
