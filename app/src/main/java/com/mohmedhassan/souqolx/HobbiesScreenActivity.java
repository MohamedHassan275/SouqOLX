package com.mohmedhassan.souqolx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.mohmedhassan.souqolx.Ads.AdDetaisActivity;

public class HobbiesScreenActivity extends AppCompatActivity {

    LinearLayout lineaelayout_antiques_collectibles,lineaelayout_books,lineaelayout_movies_music,lineaelayout_musical_instruments,
            lineaelayout_study_tools,lineaelayout_tickets_vouchers,lineaelayout_other_items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies_screen);

        lineaelayout_antiques_collectibles = findViewById(R.id.lineaelayout_antiques_collectibles);
        lineaelayout_books = findViewById(R.id.lineaelayout_books);
        lineaelayout_movies_music = findViewById(R.id.lineaelayout_movies_music);
        lineaelayout_musical_instruments = findViewById(R.id.lineaelayout_musical_instruments);
        lineaelayout_study_tools = findViewById(R.id.lineaelayout_study_tools);
        lineaelayout_tickets_vouchers = findViewById(R.id.lineaelayout_tickets_vouchers);
        lineaelayout_other_items = findViewById(R.id.lineaelayout_other_items);

        lineaelayout_antiques_collectibles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_movies_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_musical_instruments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_study_tools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_tickets_vouchers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });
        lineaelayout_other_items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IntentActivity();
            }
        });

    }

    private void IntentActivity() {

        Intent intent = new Intent(HobbiesScreenActivity.this, AdDetaisActivity.class);
        startActivity(intent);
    }
}
