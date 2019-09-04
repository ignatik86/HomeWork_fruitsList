package com.example.myhomework1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

public class OnClickDeleteListener implements View.OnLongClickListener {

    private MyAdapter _adapter;
    private int _position;

    public OnClickDeleteListener(MyAdapter _adapter, int _position) {
        this._adapter = _adapter;
        this._position = _position;
    }

    @Override
    public boolean onLongClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(_adapter.getContext());

        builder.setTitle("Delete '" + _adapter._myFruits.get(_position).get_name() + "'");
        builder.setMessage("Are you sure you want to delete?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                _adapter.remove(_adapter._myFruits.get(_position));
                Toast.makeText(_adapter.getContext(), "Deleted", Toast.LENGTH_LONG).show();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(_adapter.getContext(), "Ok, forget about it", Toast.LENGTH_LONG).show();
                dialogInterface.dismiss();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();

        return false;
    }
}
