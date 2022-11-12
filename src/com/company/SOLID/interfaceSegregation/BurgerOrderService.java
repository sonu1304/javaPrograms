package com.company.SOLID.interfaceSegregation;

public class BurgerOrderService implements OrderService {

    @Override
    public void orderBurger(int quantity) {
        System.out.println("Received order of " +quantity+ "burger");
    }

    @Override
    public void orderFries(int fries) {
        throw new UnsupportedOperationException("No fries in burger");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        throw new UnsupportedOperationException("No combo in order");
    }
}
