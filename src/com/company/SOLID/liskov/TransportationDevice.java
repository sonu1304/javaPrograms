package com.company.SOLID.liskov;

public class TransportationDevice {

    private String name;
    private double speed;
    private String engineType;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
