package com.noxx.holdall;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;


public class ListUpgradeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_upgrade);

        List<Picture> pictureList = new ArrayList<>();

        pictureList.add(new Picture(Color.MAGENTA,"Donatello", "http://donatello.pic.com", R.drawable.donatello_2));
        pictureList.add(new Picture (Color.BLUE,"Leonardo", "http://leonardo.pic.com", R.drawable.leonardo_2));
        pictureList.add(new Picture (Color.RED,"Raphael", "http://Raphael.pic.com", R.drawable.raphael_sc3a9rie_tv_2003_61));
        pictureList.add(new Picture (Color.YELLOW,"Michelangelo", "http://Michelangelo.pic.com", R.drawable.mikey_5));



        ListView listView = (ListView) findViewById(R.id.listUpgrade);

        AdapterListUpgrade myList = new AdapterListUpgrade(this, pictureList);

        listView.setAdapter(myList);

        myList.setMyListUpgrade(pictureList);

    }

}
