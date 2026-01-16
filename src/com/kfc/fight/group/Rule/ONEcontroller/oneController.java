package com.kfc.fight.group.Rule.ONEcontroller;

import java.util.Scanner;

public class oneController {

    public static void start() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("===== ONE Championship (주요)경기 종류 =====");
            System.out.println("1. 킥복싱 룰");
            System.out.println("2. 무에타이 룰");
            System.out.println("0. 뒤로가기");
            System.out.print("선택: ");

            int choice = scan.nextInt();
            scan.nextLine();

            ONERule one = new ONERule();
            switch (choice) {
                case 1 -> {
                    one.kickboxingrule();
                }
                case 2 -> {
                    one.muaythairule();
                }
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
                }
            }
        }
    }
}
