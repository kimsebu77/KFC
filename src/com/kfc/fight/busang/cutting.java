package com.kfc.fight.busang;

import java.util.Scanner;

public class cutting {
    Scanner sc = new Scanner(System.in);

    boolean bleeding;
    boolean deepCut;

    public void print() {
        System.out.println("출혈이 있는가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            bleeding = true;
        }

        System.out.println("상처가 깊은가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            deepCut = true;
        }

        if (bleeding && deepCut) {
            System.out.println("[심각도] 🔴 중증");
            System.out.println("출혈이 심하거나 상처가 깊습니다.");
            System.out.println("즉시 지혈 후 병원 방문이 필요합니다.");
            ankle.중증=true;
        } else if (bleeding) {
            System.out.println("[판단 결과] 🟡 주의");
            System.out.println("출혈이 확인되었습니다.");
            System.out.println("압박 지혈 후 소독을 진행하세요.");
            ankle.주의=true;
        } else {
            System.out.println("[판단 결과] 🟢 경미");
            System.out.println("가벼운 상처로 보입니다.");
            System.out.println("소독 후 상태를 관찰하세요.");
            ankle.경미=true;
        }
    }
}
