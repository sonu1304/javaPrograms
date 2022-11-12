package com.company.SOLID.interfaceSegregation;

public class ComboOrderService implements OrderService {

    @Override
    public void orderBurger(int quantity) {
        throw new UnsupportedOperationException("No burger in order");
    }

    @Override
    public void orderFries(int fries) {
        throw new UnsupportedOperationException("No fries in order");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        System.out.println("Received order of " +quantity+ " burger and " +fries+ "fries");
    }
}
