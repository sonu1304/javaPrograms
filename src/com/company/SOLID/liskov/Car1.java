package com.company.SOLID.liskov;

public class Car1 extends TransportationDeviceWithEngine{

    public int price = 50000;

    @Override
    public void setEngineType( String engineType) {
        if(engineType.equals("petrol")) {
            this.price = this.price + 50000;
        } else {
            this.price = this.price + 100000;
        }
    }
}
