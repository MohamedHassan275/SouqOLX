package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class PropertiesAndBuildScreenActivity extends AppCompatActivity {

    LinearLayout linerlayout_propertes_sale,linerlayout_propertes_rent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_properties_screen);

        linerlayout_propertes_sale = findViewById(R.id.linerlayout_propertes_sale);
        linerlayout_propertes_rent = findViewById(R.id.linerlayout_propertes_rent);

        linerlayout_propertes_sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PropertiesAndBuildScreenActivity.this,BuildsForSaleScreenActivity.class);
                startActivity(intent);

            }
        });

        linerlayout_propertes_rent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PropertiesAndBuildScreenActivity.this,BuildsForRendScreenActivity.class);
                startActivity(intent);
            }
        });

    }
}
