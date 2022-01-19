package com.company.SOLID.liskov;

public class TransportationDeviceWithEngine extends TransportationDeviceModified {
    private String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
