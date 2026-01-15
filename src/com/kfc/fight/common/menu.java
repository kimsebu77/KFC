package com.kfc.fight.common;

import com.kfc.fight.group.one.controller.ONEMenuController;
import com.kfc.fight.group.ufc.controller.UFCMenuController;

import java.util.Scanner;

public class menu {

    public static void showMainMenu() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the KFC system");
            System.out.println("1. 훈련 가이드");
            System.out.println("2. 부상 / 회복");
            System.out.println("3. 단체 / 룰 정보");
            System.out.println("4. 종료");
            System.out.print("선택: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1 -> {

                }

                case 2 -> {

                }
                case 3 -> {
                    selectGroup(scan);
                }
                case 4 -> {
                    System.out.println("프로그램 종료");
                }
                default -> {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                }
            }
        }
    }

    private static void selectGroup(Scanner scan) {
        while (true) {
            System.out.println("===== 단체 선택 =====");
            System.out.println("1. UFC");
            System.out.println("2. ONE");
            System.out.println("3. 경기 룰");
            System.out.println("0. 뒤로가기");
            System.out.print("선택: ");

            int org = scan.nextInt();

            switch (org) {
                case 1 -> {
                    UFCMenuController ufcMenuController = new UFCMenuController();
                    ufcMenuController.start();
                }
                case 2 -> ONEMenuController.start();
                case 3 -> {

                }
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요");
                }
            }
        }
    }
}
