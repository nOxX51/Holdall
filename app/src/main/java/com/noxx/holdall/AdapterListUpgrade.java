package com.noxx.holdall;

import android.content.Context;
import android.media.Image;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by HB on 22/11/2016.
 */

public class AdapterListUpgrade extends BaseAdapter {



        private Context contextUpgrade;
        private List<Picture> myListUpgrade = new ArrayList<>();



        public void setMyListUpgrade(List<Picture> myListUpgrade) {
        this.myListUpgrade = myListUpgrade;
            notifyDataSetChanged();
        }


        public AdapterListUpgrade(Context contextUpgrade, List myListUpgrade){
            this.contextUpgrade = contextUpgrade;
            this.myListUpgrade = myListUpgrade;

        }



        @Override
        public int getCount() {
            return myListUpgrade.size();
        }

        @Override
        public Picture getItem(int position) {
            return myListUpgrade.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if(convertView==null){
                convertView = LayoutInflater.from(contextUpgrade).inflate(R.layout.cell_upgrade_layout, parent,false);
            }
            TextView textView = (TextView) convertView.findViewById(R.id.textUpgrade);
            textView.setText(myListUpgrade.get(position).getTitle());
            textView.setTextColor(myListUpgrade.get(position).getColor());

            TextView urlView = (TextView) convertView.findViewById(R.id.showURL);
            urlView.setText(myListUpgrade.get(position).getUrl());
            urlView.setTextColor(myListUpgrade.get(position).getColor());

            ImageView imageView = (ImageView) convertView.findViewById(R.id.picture);
            imageView.setImageResource(myListUpgrade.get(position).getRessources());

            FloatingActionButton button = (FloatingActionButton) convertView.findViewById(R.id.fab);
            button.setFocusable(false);
            button.setFocusableInTouchMode(false);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myListUpgrade.remove(position);
                    notifyDataSetChanged();
                }
            });


            return convertView;
        }

}


