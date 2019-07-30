package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class MobileScreenActivity extends AppCompatActivity {

    LinearLayout lineaelayout_mobile_phone,lineaelayout_mobile_accessories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_screen);

        lineaelayout_mobile_phone = findViewById(R.id.lineaelayout_mobile_phone);
        lineaelayout_mobile_accessories = findViewById(R.id.lineaelayout_mobile_accessories);

        lineaelayout_mobile_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_mobile_accessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });

    }

    private void IntentActivity() {

        Intent intent = new Intent(MobileScreenActivity.this, AdDetaisActivity.class);
        startActivity(intent);
    }
}
