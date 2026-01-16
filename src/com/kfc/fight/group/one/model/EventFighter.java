package com.kfc.fight.group.one.model;

public class EventFighter {
    private int eventId;
    private int fighterId;
    private String fightType;

    public EventFighter(int eventId, int fighterId, String fightType) {
        this.eventId = eventId;
        this.fighterId = fighterId;
        this.fightType = fightType;
    }

    public int getEventId() {
        return eventId;
    }

    public int getFighterId() {
        return fighterId;
    }

    public String getCardType() {
        return fightType;
    }
}
