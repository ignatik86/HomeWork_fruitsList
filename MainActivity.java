package com.example.myhomework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Fruits> Mylist= new ArrayList<>();
        Mylist.add(new Fruits("apple",25f,R.drawable.apple));
        Mylist.add(new Fruits("watermelon",75f,R.drawable.watermelon));
        Mylist.add(new Fruits("banana",40f,R.drawable.banana));
        Mylist.add(new Fruits("orange",30f,R.drawable.orange));
        Mylist.add(new Fruits("orange",30f,R.drawable.orange));
        Mylist.add(new Fruits("orange",30f,R.drawable.orange));
        Mylist.add(new Fruits("orange",30f,R.drawable.orange));
        Mylist.add(new Fruits("orange",30f,R.drawable.orange));
        Mylist.add(new Fruits("orange",30f,R.drawable.orange));
        Mylist.add(new Fruits("orange",30f,R.drawable.orange));
        Mylist.add(new Fruits("orange",30f,R.drawable.orange));

        ListView simpleList = (ListView) findViewById(R.id.ignat_list);
        MyAdapter myAdapter = new MyAdapter(MainActivity.this,
                R.id.my_row, Mylist);

        if (simpleList != null) {
            simpleList.setAdapter(myAdapter);
        }

        simpleList.setClickable(true);
    }

}
