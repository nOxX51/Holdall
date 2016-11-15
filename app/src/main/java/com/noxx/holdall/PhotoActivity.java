package com.noxx.holdall;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);



        String url="http://cdn.images.express.co.uk/img/dynamic/126/590x/secondary/Jennifer-Lopez-220590.jpg";
        ImageView image = (ImageView) findViewById(R.id.picture);

        Picasso.with(this).load(url).into(image);

    }

}
