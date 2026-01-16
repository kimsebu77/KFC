package com.kfc.fight.busang;

import java.util.Scanner;

public class busangma {
    public static boolean 중증=false;
    public static boolean 주의=false;
    public static boolean 경미=false;
    static Scanner sc = new Scanner(System.in);
    public static void print(){
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        System.out.println("1. 손/손목\n" +
                "2. 어깨\n" +
                "3. 무릎\n" +
                "4. 발/발목\n" +
                "5. 갈비뼈\n" +
                "6. 얼굴(상처)");
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        System.out.print("부상 부위를 찍으세요 : ");
        int select=sc.nextInt();
        switch(select){
            case 1->hand.handprint();
            case 2->shoulder.sooulderprint();
            case 3->knee.kneeprint();
            case 4->ankle.ankleprint();
            case 5->rib.ribprint();
            case 6->cutting.cuttingprint();
            default -> {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            }
        }
    }
}
