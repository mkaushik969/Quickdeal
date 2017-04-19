package com.manas.quickdeal.Models;


public class MessageItems {
    int id;
    String name;
    String msg;
    String time;
    String no_of_msgs;
    boolean dealDone;

    public MessageItems(int id, String name, String msg, String time, String no_of_msgs, boolean dealDone) {
        this.id = id;
        this.name = name;
        this.msg = msg;
        this.time = time;
        this.no_of_msgs = no_of_msgs;
        this.dealDone = dealDone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }

    public String getTime() {
        return time;
    }

    public String getNo_of_msgs() {
        return no_of_msgs;
    }

    public boolean isDealDone() {
        return dealDone;
    }
}
