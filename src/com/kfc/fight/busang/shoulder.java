package com.kfc.fight.busang;

import java.util.Scanner;

public class shoulder {
    static Scanner sc = new Scanner(System.in);

    static boolean pain;
    static boolean canLiftArm = true;

    public static void sooulderprint() {
        System.out.println("어깨에 통증이 있는가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            pain = true;
        }

        System.out.println("팔을 들어 올릴 수 없는가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            canLiftArm = false;
        }

        if (!canLiftArm) {
            System.out.println("[심각도] 🔴 중증");
            System.out.println("어깨 기능 제한이 있습니다. 병원 방문이 필요합니다.");
            ankle.중증=true;
        } else if (pain) {
            System.out.println("[판단 결과] 🟡 주의");
            System.out.println("어깨 통증이 있습니다.");
            System.out.println("무리한 훈련을 중단하고 휴식을 취하세요.");
            ankle.주의=true;
        } else {
            System.out.println("[판단 결과] 🟢 경미");
            System.out.println("큰 이상은 없어 보입니다.");
            ankle.경미=true;
        }
    }
}
