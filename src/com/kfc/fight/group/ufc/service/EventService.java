package com.kfc.fight.group.ufc.service;

import com.kfc.fight.group.ufc.dao.EventDAO;
import com.kfc.fight.group.ufc.model.Event;

import java.util.List;

public class EventService {

    private EventDAO eventDAO = new EventDAO();

    public void showAllEvents() {
        List<Event> events = eventDAO.findAll();

        System.out.println("=== UFC 이벤트 목록 ===");
        for (Event e : events) {
            System.out.println(
                    e.getId() + ". " +
                    e.getNum() + " | " +
                    e.getDate() + " | " +
                    e.getLocation()
            );
        }
    }
}
