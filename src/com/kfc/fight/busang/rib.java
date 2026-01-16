package com.kfc.fight.busang;

import java.util.Scanner;

public class rib {
    static Scanner sc = new Scanner(System.in);

    static boolean pain;
    static boolean painWhenBreathing;

    public static void ribprint() {
        System.out.println("갈비뼈에 통증이 있는가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            pain = true;
        }

        System.out.println("숨 쉴 때 통증이 심해지는가? (Y/N)");
        if (sc.next().equalsIgnoreCase("Y")) {
            painWhenBreathing = true;
        }

        if (pain && painWhenBreathing) {
            System.out.println("[심각도] 🔴 중증");
            System.out.println("호흡 시 통증이 심합니다.");
            System.out.println("즉시 훈련을 중단하고 병원 방문을 권장합니다.");
            busangma.중증 =false;
        } else if (painWhenBreathing) {
            System.out.println("[판단 결과] 🟡 주의");
            System.out.println("갈비뼈 통증이 있습니다.");
            System.out.println("타격 훈련을 중단하고 휴식을 취하세요.");
            busangma.주의 =true;
        } else {
            System.out.println("[판단 결과] 🟢 경미");
            System.out.println("큰 이상은 없어 보입니다.");
            System.out.println("무리한 움직임은 피하세요.");
            busangma.경미 =true;
        }
    }
}
