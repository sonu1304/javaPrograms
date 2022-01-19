package com.company.SOLID.interfaceSegregation.afterUsingISP;

public class BurgerOrderService implements BurgerOrderInterface {

    @Override
    public void orderBurger(int quantity) {
        System.out.println("Received order of " +quantity+ "burger");
    }

}
