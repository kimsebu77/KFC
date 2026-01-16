package com.kfc.fight.group.Rule;

import com.kfc.fight.group.Rule.ONEcontroller.oneController;

import java.util.Scanner;

public class controller {
    private static Scanner scan = new Scanner(System.in);

    public static void start() {
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
                    controller.start();
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
