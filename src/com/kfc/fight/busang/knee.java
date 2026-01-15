package com.kfc.fight.busang;

import java.util.Scanner;

public class knee {
    Scanner sc = new Scanner(System.in);

    boolean pain;
    boolean canWalk = true;

    public void print() {
        System.out.println("무릎에 통증이 있는가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            pain = true;
        }

        System.out.println("걷기 어려운가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            canWalk = false;
        }

        if (!canWalk) {
            System.out.println("[심각도] 🔴 중증");
            System.out.println("보행에 문제가 있습니다. 병원 방문이 필요합니다.");
            ankle.중증=true;
        } else if (pain) {
            System.out.println("[판단 결과] 🟡 주의");
            System.out.println("무릎 통증이 있습니다.");
            System.out.println("점프나 킥 훈련을 중단하세요.");
            ankle.주의=true;
        } else {
            System.out.println("[판단 결과] 🟢 경미");
            System.out.println("가벼운 휴식으로 충분합니다.");
            ankle.경미=true;
        }
    }
}
