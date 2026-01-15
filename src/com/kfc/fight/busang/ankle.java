package com.kfc.fight.busang;

import java.util.Scanner;

public class ankle {
    public static boolean 중증=false;
    public static boolean 주의=false;
    public static boolean 경미=false;
    Scanner sc = new Scanner(System.in);

    boolean pain;
    boolean swelling;
    boolean canWalk = true;

    public void print() {
        System.out.println("발목에 통증이 있는가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            pain = true;
        }

        System.out.println("붓기가 있는가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            swelling = true;
        }

        System.out.println("걷기 어려운가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            canWalk = false;
        }

        if (!canWalk) {
            System.out.println("[심각도] 🔴 중증");
            System.out.println("보행이 어려운 상태입니다.");
            System.out.println("즉시 훈련을 중단하고 병원 방문을 권장합니다.");
            중증=true;
        } else if (pain || swelling) {
            System.out.println("[판단 결과] 🟡 주의");
            System.out.println("발목에 이상이 있습니다.");
            System.out.println("냉찜질 후 휴식을 취하고 테이핑을 권장합니다.");
            주의=true;
        } else {
            System.out.println("[판단 결과] 🟢 경미");
            System.out.println("큰 이상은 없어 보입니다.");
            System.out.println("훈련 강도를 낮추고 상태를 관찰하세요.");
            경미=true;
        }
    }
}
