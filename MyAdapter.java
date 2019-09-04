package com.example.myhomework1;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter<Fruits>{

    List<Fruits> _myFruits;

    public MyAdapter(Context context, int resource, List<Fruits> objects) {
        super(context, resource, objects);
        _myFruits = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d("=============", "Get view for " + position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row, parent, false);
        }

        convertView.setOnClickListener(new onClickViewListener(this, position));

        convertView.setOnLongClickListener(new OnClickDeleteListener(this, position));

        Fruits currFruit = getItem(position);

        TextView tvName = convertView.findViewById(R.id.textName);
        TextView tvCal = convertView.findViewById(R.id.calories);
        ImageView im = convertView.findViewById(R.id.imageFruit);

        im.setImageResource(currFruit.get_picture());
        tvCal.setText(String.valueOf(currFruit.get_calories()));
        tvName.setText(currFruit.get_name());

        return convertView;
    }
}
