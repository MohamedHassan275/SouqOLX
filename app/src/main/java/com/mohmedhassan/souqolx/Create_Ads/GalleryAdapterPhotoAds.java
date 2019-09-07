package com.mohmedhassan.souqolx.Create_Ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mohmedhassan.souqolx.R;

import java.util.ArrayList;

public class GalleryAdapterPhotoAds extends RecyclerView.Adapter<GalleryAdapterPhotoAds.CustomViewHolder> {

    private Context context;
    private ArrayList<String> imageModels;
    private ArrayList<Bitmap> bitmapArrayList;

    public GalleryAdapterPhotoAds(Context context, ArrayList<String> imageModels, ArrayList<Bitmap> bitmapArrayList) {
        this.context = context;
        this.imageModels = imageModels;
        this.bitmapArrayList = bitmapArrayList;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {


        public ImageView ImageAds;


        public CustomViewHolder(View view) {
            super(view);

            ImageAds = (ImageView) view.findViewById(R.id.imageView_Ads);

        }
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.reycle_view_image_ads_item,viewGroup,false);
        return new GalleryAdapterPhotoAds.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int position) {

        customViewHolder.ImageAds.setImageBitmap(bitmapArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return imageModels.size();
    }
}
