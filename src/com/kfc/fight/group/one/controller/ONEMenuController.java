package com.kfc.fight.group.one.controller;

import com.kfc.fight.group.one.service.EventService;
import com.kfc.fight.group.one.service.FighterService;
import com.kfc.fight.group.one.service.RankingService;

import java.util.Scanner;

public class ONEMenuController {
    static Scanner scan = new Scanner(System.in);
    RankingService rankingService = new RankingService();
    EventService eventService = new EventService();
    static FighterService fighterService = new FighterService();

    public void start() {
        while (true) {
            System.out.println("===== UFC 메뉴 =====");
            System.out.println("1. 랭킹");
            System.out.println("2. 이벤트");
            System.out.println("3. 선수 검색");
            System.out.println("0. 뒤로가기");
            System.out.print("선택: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> {
                    rankingService.showRankingMenu();
                }
                case 2 -> {
                    eventService.showEventFightCard();
                }
                case 3 -> {
                    System.out.print("선수 이름 입력: ");
                    String name = scan.nextLine();
                    fighterService.search(name);
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
}
