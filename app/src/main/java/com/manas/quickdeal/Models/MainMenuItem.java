package com.manas.quickdeal.Models;

/**
 * Created by HP on 19-04-2017.
 */

public class MainMenuItem {

    int id;
    String name;
    int res;

    public MainMenuItem(int id, String name, int res) {
        this.id = id;
        this.name = name;
        this.res = res;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRes() {
        return res;
    }
}
