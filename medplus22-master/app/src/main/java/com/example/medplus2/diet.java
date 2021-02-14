package com.example.medplus2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class diet extends AppCompatActivity {

    String[] listviewTitle = new String[]{
            "EGG", "CHICKEN", "NUTS", "FRUITS",
            "EGG", "CHICKEN", "NUTS", "FRUITS",
    };

    int[] listviewImage = new int[]{
            R.drawable.eggs, R.drawable.chicken, R.drawable.nuts, R.drawable.fruits,
            R.drawable.eggs, R.drawable.chicken, R.drawable.nuts, R.drawable.fruits,
    };

    String[] listviewShortDescription = new String[]{
            "One per a day", "Once per week", "Daily at early moring", "Twice per a day",
            "One per a day", "Once per week", "Daily at early moring", "Twice per a day",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 8; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_discription", listviewShortDescription[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_discription"};
        int[] to = {R.id.listview_image, R.id.listview_item_title, R.id.listview_item_short_description};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.customlistview, from, to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);
    }
}