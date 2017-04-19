package com.manas.quickdeal.Models;

/**
 * Created by HP on 19-04-2017.
 */

public class Items {

    int id;
    String name;

    public Items(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
