package com.mohmedhassan.souqolx.Ads;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mohmedhassan.souqolx.AdsDetailsActivity;
import com.mohmedhassan.souqolx.HomeAndGardenScreenActivity;
import com.mohmedhassan.souqolx.R;

import java.util.ArrayList;

public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.CustomViewHolder> {

    Context context;
    ArrayList<AdsModel> adsModels;

    public AdsAdapter(Context context, ArrayList<AdsModel> adsModels) {
        this.context = context;
        this.adsModels = adsModels;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        public ImageView ImageViewAds;
        public TextView Tv_DetailsItem, Tv_PriceItem, Tv_DateItem,Tv_PlaceItem,tv_Fatured_recycle_view;


        public CustomViewHolder(View view) {
            super(view);

            ImageViewAds = (ImageView) view.findViewById(R.id.imageView_recycle_view);
            Tv_DetailsItem = (TextView) view.findViewById(R.id.tv_details_recycle_view);
            Tv_PriceItem = (TextView) view.findViewById(R.id.tv_price_recycle_view);
            Tv_DateItem = (TextView) view.findViewById(R.id.tv_date_recycle_view);
            Tv_PlaceItem = (TextView) view.findViewById(R.id.tv_place_recycle_view);
            tv_Fatured_recycle_view = (TextView) view.findViewById(R.id.tv_Fatured_recycle_view);


        }
    }
    @NonNull
    @Override
    public AdsAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ads_recycle_view,viewGroup,false);
        return new AdsAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomViewHolder customViewHolder, int position) {

        AdsModel adsModel =adsModels.get(position);
        customViewHolder.ImageViewAds.setImageResource(adsModel.getAdsImageView());
        customViewHolder.Tv_DetailsItem.setText(adsModel.getDetails());
        customViewHolder.Tv_PriceItem.setText(adsModel.getPrice());
        customViewHolder.Tv_DateItem.setText(adsModel.getDate());
        customViewHolder.Tv_PlaceItem.setText(adsModel.getPlace());
        customViewHolder.tv_Fatured_recycle_view.setText(adsModel.getFatured());


        customViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(customViewHolder.itemView.getContext(), AdsDetailsActivity.class);
                customViewHolder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return adsModels.size();
    }
}
