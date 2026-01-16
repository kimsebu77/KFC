package com.kfc.fight.group.one.service;

import com.kfc.fight.group.one.dao.EventDAO;
import com.kfc.fight.group.one.dao.EventFighterDAO;
import com.kfc.fight.group.one.model.Event;

import java.util.*;

public class EventService {

    private EventDAO eventDAO = new EventDAO();
    private EventFighterDAO eventFightDAO = new EventFighterDAO();
    private Scanner scan = new Scanner(System.in);

    public void showAllEvents() {
        List<Event> events = eventDAO.findAll();

        System.out.println("=== ONE 이벤트 목록 ===");
        for (Event e : events) {
            System.out.println(
                    e.getId() + ". " +
                            e.getNum() + " | " +
                            e.getDate() + " | " +
                            e.getLocation()
            );
        }
    }

    public void showEventFightCard() {
        List<Event> events = eventDAO.findAll();

        showAllEvents();

        System.out.print("이벤트 선택 (0. 뒤로가기): ");
        int choice = Integer.parseInt(scan.nextLine());
        if (choice == 0) return;

        Event selected = events.get(choice - 1);
        showFightCard(selected.getId());
    }

    private void showFightCard(int eventId) {
        Map<String, Map<Integer, List<String>>> cards = eventFightDAO.getFightCard(eventId);

        for (String cardType : cards.keySet()) {
            System.out.println("\n===== " + cardType + " =====");
            Map<Integer, List<String>> fights = cards.get(cardType);

            // fightNo는 1, 2, 3... 순서대로 나옵니다.
            for (Integer fightNo : fights.keySet()) {
                List<String> fighters = fights.get(fightNo);

                System.out.print("Match " + fightNo + ": ");
                if (fighters.size() >= 2) {
                    System.out.println(fighters.get(0) + " VS " + fighters.get(1));
                } else {
                    System.out.println(fighters.get(0) + " VS (상대 미정)");
                }
            }
        }
    }
}