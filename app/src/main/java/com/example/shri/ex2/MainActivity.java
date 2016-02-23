package com.example.shri.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] mobileArray =
                {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Windows7","Max OS X"};
                        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                        R.layout.support_simple_spinner_dropdown_item, mobileArray);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                if(position == 0)
                    Toast.makeText(getApplicationContext(),"you clicked android",Toast.LENGTH_SHORT).show();
                if(position == 1)
                    Toast.makeText(getApplicationContext(),"you clicked iphone",Toast.LENGTH_SHORT).show();
                if(position == 2)
                    Toast.makeText(getApplicationContext(),"you clicked windows",Toast.LENGTH_SHORT).show();
                if(position == 3)
                    Toast.makeText(getApplicationContext(),"you clicked blackberry",Toast.LENGTH_SHORT).show();
                if(position == 4)
                    Toast.makeText(getApplicationContext(),"you clicked webos",Toast.LENGTH_SHORT).show();
                if(position == 5)
                    Toast.makeText(getApplicationContext(),"you clicked ubuntu",Toast.LENGTH_SHORT).show();
                if(position == 6)
                    Toast.makeText(getApplicationContext(),"you clicked windows",Toast.LENGTH_SHORT).show();
                if(position == 7)
                    Toast.makeText(getApplicationContext(),"you clicked mac os x",Toast.LENGTH_SHORT).show();
            }
        });
    }
}