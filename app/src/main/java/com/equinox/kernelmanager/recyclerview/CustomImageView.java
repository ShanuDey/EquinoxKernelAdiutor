package com.equinox.kernelmanager.recyclerview;

import android.view.View;
import android.widget.ImageView;

import com.equinox.kernelmanager.R;
import com.equinox.kernelmanager.views.recyclerview.RecyclerViewItem;

public class CustomImageView extends RecyclerViewItem {
    private ImageView imageView;

    @Override
    public int getLayoutRes() {
        return R.layout.rv_custom_image_view;
    }

    @Override
    public void onCreateView(View view) {
        super.onCreateView(view);

        imageView = (ImageView) view.findViewById(R.id.imageView);
    }
}

