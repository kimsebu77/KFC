package com.kfc.fight.group.ufc.model;

public class Fighter {
    private int id;
    private String name;
    private int rich;
    private int height;
    private int weight;
    private int win;
    private int lose;
    private double attackAccuracy;
    private double takedownAccuracy;
    private int ko_tko;
    private String fighter_rank;

    public Fighter(int id, String name, int rich, int height, int weight, int win, int lose, double attackAccuracy, double takedownAccuracy, int ko_tko, String fighter_rank) {
        this.id = id;
        this.name = name;
        this.rich = rich;
        this.height = height;
        this.weight = weight;
        this.win = win;
        this.lose = lose;
        this.attackAccuracy = attackAccuracy;
        this.takedownAccuracy = takedownAccuracy;
        this.ko_tko = ko_tko;
        this.fighter_rank = fighter_rank;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRich() {
        return rich;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public double getAttackAccuracy() {
        return attackAccuracy;
    }

    public double getTakedownAccuracy() {
        return takedownAccuracy;
    }

    public int getKo_tko() {
        return ko_tko;
    }

    public String getFighter_rank() {
        return fighter_rank;
    }
}
