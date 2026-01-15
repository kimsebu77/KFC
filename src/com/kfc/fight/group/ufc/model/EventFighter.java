package com.kfc.fight.group.ufc.model;

public class EventFighter {
    private int eventId;
    private int fighterId;
    private String cardType;

    public EventFighter(int eventId, int fighterId, String cardType) {
        this.eventId = eventId;
        this.fighterId = fighterId;
        this.cardType = cardType;
    }

    public int getEventId() {
        return eventId;
    }

    public int getFighterId() {
        return fighterId;
    }

    public String getCardType() {
        return cardType;
    }
}
