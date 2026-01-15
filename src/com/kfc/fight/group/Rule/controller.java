package com.kfc.fight.group.Rule;

import java.util.Scanner;

public class controller {
    private Scanner scan = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("===== 단체 / 룰 정보 =====");
            System.out.println("1. UFC 룰 보기");
            System.out.println("2. ONE Championship 룰 보기");
            System.out.println("0. 뒤로가기");
            System.out.print("선택: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> {
                    UFCRule.rule();
                }
                case 2 -> {
//                    ONERule.rule();
                }
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요");
                }
            }
        }
    }
}
