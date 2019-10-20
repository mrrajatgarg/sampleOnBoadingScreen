package com.example.onboardingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context mContext;
    LayoutInflater mLayoutInflater;

    SliderAdapter(Context context) {
        this.mContext = context;
    }

    public int[] slide_images = {
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
    };

    public String[] slide_heading = {
            "Eat",
            "Sleep"
    };

    public String[] descriptions = {
            "hello 1",
            "hello 2"
    };





    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        mLayoutInflater = (LayoutInflater) mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
        View view = mLayoutInflater.inflate(R.layout.slide_layout, container, false);

        /**

        ImageView imageView = view.findViewById(R.id.imgView);
        TextView txtView = view.findViewById(R.id.txtview);

        imageView.setImageResource(slide_images[position]);
        txtView.setText(slide_heading[position]);
         **/

        container.addView(view);


        return view;

    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((RelativeLayout) object);

    }
}
