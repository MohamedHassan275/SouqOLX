package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class HomeAndGardenScreenActivity extends AppCompatActivity {

    LinearLayout lineaelayout_decoration_accessories,lineaelayout_furniture,lineaelayout_garden_outdoor,
            lineaelayout_kitchenware,lineaelayout_other_home_garden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_and_garden_screen);

        lineaelayout_decoration_accessories = findViewById(R.id.lineaelayout_decoration_accessories);
        lineaelayout_furniture = findViewById(R.id.lineaelayout_furniture);
        lineaelayout_garden_outdoor = findViewById(R.id.lineaelayout_garden_outdoor);
        lineaelayout_kitchenware = findViewById(R.id.lineaelayout_kitchenware);
        lineaelayout_other_home_garden = findViewById(R.id.lineaelayout_other_home_garden);

        lineaelayout_decoration_accessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeAndGardenScreenActivity.this, AdDetaisActivity.class);
                startActivity(intent);
            }
        });
        lineaelayout_furniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_garden_outdoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_kitchenware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_other_home_garden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });

    }

    private void IntentActivity() {

        Intent intent = new Intent(HomeAndGardenScreenActivity.this, AdDetaisActivity.class);
        startActivity(intent);
    }
}
