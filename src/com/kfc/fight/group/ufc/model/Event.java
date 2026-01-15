package com.kfc.fight.group.ufc.model;

public class Event {
    private int id;
    private String num;
    private String date;
    private String location;

    Event() {
    }

    public Event(int id, String num, String date, String location) {
        this.id = id;
        this.num = num;
        this.date = date;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getNum() {
        return num;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }
}
