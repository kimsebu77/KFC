package com.kfc.fight.busang;

import java.util.Scanner;

public class hand {
    static Scanner sc = new Scanner(System.in);
    static boolean pain;
    static boolean swelling;
    static boolean cantMakeFist;
    public static void handprint(){
        System.out.println("통증이 있는가? Y/N");
        if(sc.next().equals("Y")){
            pain = true;
        }
        System.out.println("붓기가 있는가? Y/N");
        if(sc.next().equals("Y")){
            swelling = true;
        }
        System.out.println("주먹을 쥘 수 없는가? Y/N");
        if(sc.next().equals("Y")){
            cantMakeFist = true;
        }
        if (pain && swelling && cantMakeFist) {
            System.out.println("[심각도] 🔴 중증");
            System.out.println("즉시 훈련을 중단하고 병원 방문을 권장합니다.");
            ankle.중증=true;
        } else if (pain || swelling) {
            System.out.println("[판단 결과] 🟡 주의");
            System.out.println("통증 또는 붓기가 확인되었습니다.");
            System.out.println("현재 상태에서 훈련을 계속하면 부상이 악화될 수 있습니다.");
            System.out.println("오늘은 훈련을 중단하고 냉찜질과 휴식을 권장합니다.");
            System.out.println("증상이 2~3일 이상 지속되면 병원 방문을 고려하세요.");
            ankle.주의=true;
        } else {
            System.out.println("[판단 결과] 🟢 경미");
            System.out.println("현재로서는 큰 이상은 없어 보입니다.");
            System.out.println("가벼운 스트레칭과 휴식으로 충분히 회복될 수 있습니다.");
            System.out.println("무리한 훈련은 피하고 상태를 계속 관찰하세요.");
            ankle.경미=true;
        }

    }
}
