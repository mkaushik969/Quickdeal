package com.manas.quickdeal.Models;

/**
 * Created by HP on 19-04-2017.
 */

public class Service {
    int id;
    String name;
    String dist;

    public Service(int id, String name, String dist) {
        this.id = id;
        this.name = name;
        this.dist = dist;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDist() {
        return dist;
    }
}
