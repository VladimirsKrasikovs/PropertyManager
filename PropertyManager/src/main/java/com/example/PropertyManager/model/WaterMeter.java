package com.example.PropertyManager.model;

public class WaterMeter {

    private long id;
    private String number;
    private String type;
    private double startData;

    public WaterMeter(long id, String number, String type, double startData) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.startData = startData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getStartData() {
        return startData;
    }

    public void setStartData(double startData) {
        this.startData = startData;
    }
}
