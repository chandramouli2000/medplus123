package com.example.medplus2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class notification extends AppCompatActivity {

    String[] listviewTitle = new String[]{
            "parcetmol", "parcetmol", "Anasin", "volini",
    };

    int[] listviewImage = new int[]{
            R.drawable.paracetmol, R.drawable.caripil, R.drawable.iron, R.drawable.volini,
    };

    String[] listviewShortDescription = new String[]{
            "night  at 8 pm", "night at 7 pm", "afternoon 2 pm", "morning 9 am",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 4; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_discription", listviewShortDescription[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_discription"};
        int[] to = {R.id.listview_image1, R.id.listview_item_title1, R.id.listview_item_short_description1};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.customlistview1, from, to);
        ListView androidListView = (ListView) findViewById(R.id.list_view1);
        androidListView.setAdapter(simpleAdapter);
    }
}