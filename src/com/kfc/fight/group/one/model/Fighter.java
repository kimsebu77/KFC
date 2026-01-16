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
    private String AVG_Duration;
    private String fighter_rank;
    private String striking;
    // 2. 생성자 파라미터에 weightClass 추가 (총 12개)
    public Fighter(int id, String name, String weightClass, int height, int weight,
                   int win, int lose,int finishes,String AVG_Duration,
                   String fighter_rank,String striking) {
        this.id = id;
        this.name = name;
        this.weightClass = weightClass; // 추가
        this.height = height;
        this.weight = weight;
        this.win = win;
        this.lose = lose;
        this.finishes = finishes;
        this.AVG_Duration = AVG_Duration;
        this.fighter_rank = fighter_rank;
        this.striking = striking;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getWeightClass() { return weightClass; } // 3. Getter 추가
    public int getHeight() { return height; }
    public int getWeight() { return weight; }
    public int getWin() { return win; }
    public int getLose() { return lose; }
    public int getFinishes(){return finishes;}
    public String getAVG_Duration() { return AVG_Duration; }
    public String getFighter_rank() { return fighter_rank; }
    public String getStriking() { return striking; }
}