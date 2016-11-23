package com.noxx.holdall;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HB on 22/11/2016.
 */

public class AdapterList extends BaseAdapter {

    private Context context;
    private List<String>myList = new ArrayList<>();




    public void setMyList(List myList) {
        this.myList = myList;
        notifyDataSetChanged();
    }

    public AdapterList(Context context ){
        this.context = context;

    }



    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public String getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.cell_layout, parent,false);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.text);
        textView.setText(myList.get(position));
        return convertView;
    }


}
