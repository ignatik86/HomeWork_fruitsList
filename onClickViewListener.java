package com.example.myhomework1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

public class onClickViewListener implements View.OnClickListener  {

    private MyAdapter _adapter;
    private int _viewItem;

    public onClickViewListener(MyAdapter _adapter, int _viewItem) {
        this._adapter = _adapter;
        this._viewItem = _viewItem;
    }

    @Override
    public void onClick(View view) {

        Fruits currFruit = _adapter._myFruits.get(_viewItem);

        AlertDialog.Builder builder = new AlertDialog.Builder(_adapter.getContext());
        builder.setIcon(currFruit.get_picture());
        builder.setTitle("view '" + currFruit.get_name() + "'");
        builder.setMessage(currFruit.get_name() +" "+ currFruit.get_calories());
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });


        AlertDialog alert = builder.create();
        alert.show();
    }
}
