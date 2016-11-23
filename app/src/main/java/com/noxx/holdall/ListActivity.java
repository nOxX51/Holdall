package com.noxx.holdall;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;

public class ListActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        List<String> list = new ArrayList<>();
        list.add("Donatello");
        list.add("Leonardo");
        list.add("Raphael");
        list.add("Michelangelo");
        list.add("Splinter");
        list.add("April O'Neil");
        list.add("Krong");



        ListView listView = (ListView) findViewById(R.id.list);

        AdapterList myList = new AdapterList(this);

        listView.setAdapter(myList);

        myList.setMyList(list);


    }


}
