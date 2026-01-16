package com.kfc.fight.group.one.model;

public class Fighter {
    private int id;
    private String name;
    private String weightClass; // 1. 필드 추가
    private int height;
    private int weight;
    private int win;
    private int lose;
    private int finishes;
    private String avg_duration;
    private int ko_tko;
    private String fighter_rank;
    private String striking;

    // 2. 생성자 파라미터에 weightClass 추가 (총 12개)
    public Fighter(int id, String name, String weightClass, int rich, int height, int weight,
                   int win, int lose, double attackAccuracy, double takedownAccuracy,
                   int ko_tko, String fighter_rank) {
        this.id = id;
        this.name = name;
        this.weightClass = weightClass; // 추가
        this.height = height;
        this.weight = weight;
        this.win = win;
        this.lose = lose;
        this.finishes = finishes;
        this.avg_duration = avg_duration;
        this.ko_tko = ko_tko;
        this.fighter_rank = fighter_rank;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWeightClass() {
        return weightClass;
    } // 3. Getter 추가

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

    public int getFinishes() {
        return finishes;
    }

    public String getAvg_duration() {
        return avg_duration;
    }

    public int getKo_tko() {
        return ko_tko;
    }

    public String getFighter_rank() {
        return fighter_rank;
    }
}