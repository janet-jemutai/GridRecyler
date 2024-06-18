package com.jemutai.gridlayoutrecycler

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

@BindingAdapter("imageUrl")
fun bindImage(imageView: ImageView, imageUrl: String?) {
    if (!imageUrl.isNullOrEmpty()) {
        Picasso.get()
            .load(imageUrl)
            .placeholder(R.drawable.m5)
            .error(R.drawable.m3)
            .into(imageView)
    }
}

