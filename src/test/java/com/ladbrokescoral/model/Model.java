package com.ladbrokescoral.model;

public class Model {
    private String eventSport;
    private String eventClass;
    private String eventType;
    private String eventEvent;
    private String eventMarket;
    private String eventOutcome;

    public String getEventClass() {
        return eventClass;
    }

    public String getEventMarket() {
        return eventMarket;
    }

    public String getEventSport() {
        return eventSport;
    }

    public String getEventEvent() {
        return eventEvent;
    }

    public String getEventOutcome() {
        return eventOutcome;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventClass(String eventClass) {
        this.eventClass = eventClass;
    }

    public void setEventEvent(String eventEvent) {
        this.eventEvent = eventEvent;
    }

    public void setEventMarket(String eventMarket) {
        this.eventMarket = eventMarket;
    }

    public void setEventOutcome(String eventOutcome) {
        this.eventOutcome = eventOutcome;
    }

    public void setEventSport(String eventSport) {
        this.eventSport = eventSport;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
