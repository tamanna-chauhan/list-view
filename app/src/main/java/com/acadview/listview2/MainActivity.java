package com.acadview.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LIST VIEW IN XML STEP1
        ListView listView = findViewById(R.id.list);
//        2 ARRAY
//
        final String[] items = getResources().getStringArray(R.array.items);
//        3 ADAPTOR
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
//        4
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         , long l) {

                Toast.makeText(MainActivity.this, "Item: "+items[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
