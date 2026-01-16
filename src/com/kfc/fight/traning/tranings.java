package com.kfc.fight.traning;

import com.kfc.fight.busang.*;

import java.util.Scanner;

public class tranings {
    static Scanner sc = new Scanner(System.in);
    public static void print(){
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        System.out.println("1. 맷집\n" +
                "2. 스트렝스\n" +
                "3. 웨이트\n" +
                "4. 정신력");
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        System.out.print("원하는 트레이닝을 찍으세요 : ");
        int select=sc.nextInt();
        switch(select){
            case 1-> 맷집.print();
            case 2-> 스트렝스.print();
            case 3-> 웨이트.print();
            case 4-> 정신력.print();
            default -> {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }
        }
    }
}

