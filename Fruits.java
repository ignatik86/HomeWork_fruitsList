package com.example.myhomework1;

public class Fruits {

    private String  _name ;
    private  float _calories;
    private  int _picture;

    public Fruits(String name, float calories, int picture) {//constructor
        _name = name;
        _calories = calories;
        _picture = picture;
    }
    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public float get_calories() {
        return _calories;
    }

    public void set_calories(float _calories) {
        this._calories = _calories;
    }

    public int get_picture() {
        return _picture;
    }

    public void set_picture(int _picture) {
        this._picture = _picture;
    }




}
