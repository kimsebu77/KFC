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
    public static void allprint (){
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
        if(busangma.중증==true){
            System.out.println("현재 부상 상태는 중증입니다.");
            System.out.println("모든 훈련을 중단하고 회복에 집중하세요.");
        }
        else if(busangma.주의==true){
            System.out.println("현재 부상 상태는 주의 단계입니다.");
            System.out.println("훈련은 제한적으로만 진행해야 합니다.");
        } else if (busangma.경미==true) {
            System.out.println("현재 부상 상태는 경미합니다.");
            System.out.println("훈련은 가능하나 강도 조절이 필요합니다.");
        }
        else{
            System.out.println("현재 상태를 확인할 수 없습니다 컨디션에 맞게 훈련하세요");
        }
        System.out.println();
        System.out.println("==============================");;
    }
}
