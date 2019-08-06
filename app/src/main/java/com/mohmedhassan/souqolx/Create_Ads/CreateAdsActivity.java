package com.mohmedhassan.souqolx.Create_Ads;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.mohmedhassan.souqolx.R;

public class CreateAdsActivity extends AppCompatActivity {

    LinearLayout linealayout_TitleAds,linealayout_DsescriptionAds,linealayout_LocationAds,linealayout_NameAds,
            linealayout_EmailAds,linealayout_MobileAds;
    EditText ed_Title,ed_Description,ed_Name,ed_Email,ed_Mobile;
    TextView tv_takePhoto,tv_title,tv_description,tv_location,tv_name,tv_email,tv_mobile;
    Spinner spiner_location,spiner_Category;
    ArrayAdapter<CharSequence> arrayAdapter_Location;
    ArrayAdapter<CharSequence> arrayAdapter_Category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_ads);



        DifineViews();
        SetOnClickLister();

        arrayAdapter_Location = ArrayAdapter.createFromResource(this,
                R.array.location_item , android.R.layout.simple_spinner_item);
        arrayAdapter_Location.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner_location.setAdapter(arrayAdapter_Location);

        arrayAdapter_Category = ArrayAdapter.createFromResource(this,
                R.array.category_item , android.R.layout.simple_spinner_item);
        arrayAdapter_Category.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spiner_Category.setAdapter(arrayAdapter_Category);


    }

    private void DifineViews() {

        spiner_location = findViewById(R.id.spiner_location);
        spiner_Category = findViewById(R.id.spiner_Category);
        linealayout_TitleAds = findViewById(R.id.linealayout_TitleAds);
        linealayout_DsescriptionAds = findViewById(R.id.linealayout_DsescriptionAds);
        linealayout_LocationAds = findViewById(R.id.linealayout_LocationAds);
        linealayout_NameAds = findViewById(R.id.linealayout_NameAds);
        linealayout_EmailAds = findViewById(R.id.linealayout_EmailAds);
        linealayout_MobileAds = findViewById(R.id.linealayout_MobileAds);
        ed_Title = findViewById(R.id.ed_Title);
        ed_Description = findViewById(R.id.ed_Description);
        ed_Name = findViewById(R.id.ed_Name);
        ed_Email = findViewById(R.id.ed_Email);
        ed_Mobile = findViewById(R.id.ed_Mobile);
        tv_takePhoto = findViewById(R.id.tv_takePhoto);
        tv_title = findViewById(R.id.tv_Title);
        tv_description = findViewById(R.id.tv_description);
        tv_name = findViewById(R.id.tv_name);
        tv_location = findViewById(R.id.tv_location);
        tv_email = findViewById(R.id.tv_email);
        tv_mobile = findViewById(R.id.tv_mobile);
    }

    private void SetOnClickLister() {

        ed_Title.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {


            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                tv_title.setVisibility(View.VISIBLE);

            }

            @Override
            public void afterTextChanged(Editable s) {


            }
        });
    }
}
