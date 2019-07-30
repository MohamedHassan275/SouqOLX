package com.mohmedhassan.souqolx.Ads;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.mohmedhassan.souqolx.R;

import java.util.ArrayList;

public class AdDetaisActivity extends AppCompatActivity {

    Context context;
    ArrayList<AdsModel>adsModels = new ArrayList<>();
    AdsAdapter adsAdapter;
    RecyclerView recyclerview_item_Ads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad_detais);

        recyclerview_item_Ads = findViewById(R.id.recyclerview_item_Ads);

        adsAdapter = new AdsAdapter(context, adsModels);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this
                , LinearLayoutManager.VERTICAL, false);
        recyclerview_item_Ads.setLayoutManager(mLayoutManager);
        recyclerview_item_Ads.setItemAnimator(new DefaultItemAnimator());
        recyclerview_item_Ads.setAdapter(adsAdapter);

        AdsItem();

    }

    private void AdsItem() {

        AdsModel adsModel = new AdsModel(R.drawable.home,"مطلوب مبرمج اندرويد و Ios","3500","27 june",
                "Nasr City",null);
        adsModels.add(adsModel);

        adsModel = new AdsModel(R.drawable.cars,"مطلوب مبرمج ويب و Ios","3000","29 june",
                "Cairo","Featured");
        adsModels.add(adsModel);

        adsModel = new AdsModel(R.drawable.home,"مطلوب مبرمج ويب ","2500","2 august"
                ,"التجمع الخامس","Featured");
        adsModels.add(adsModel);

        adsModel = new AdsModel(R.drawable.bike,"مطلوب عمل حر","4000","5 august",
                "مصر الجديدة",null);
        adsModels.add(adsModel);

        adsModel = new AdsModel(R.drawable.business,"مبرمج اندرويد و Ios","4000","1 august",
                "Helwan","Featured");
        adsModels.add(adsModel);

        adsModel = new AdsModel(R.drawable.mobiles,"مطلوب UI / UX","5000","1 septemper",
                "Giza",null);
        adsModels.add(adsModel);
    }
}
