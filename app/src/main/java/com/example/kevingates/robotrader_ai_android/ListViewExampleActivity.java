package com.example.kevingates.robotrader_ai_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.net.URL;
//import android.widget.ArrayAdapter;
import 	java.util.*;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class ListViewExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);

        myListView();
    }

    public void myListView() {
        final ListView listview = (ListView) findViewById(R.id.listView2);
        String[] values = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile" };

        final ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < values.length; ++i) {
            list.add(values[i]);
        }
        final ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);

        listview.setAdapter(adapter);
    }
}
