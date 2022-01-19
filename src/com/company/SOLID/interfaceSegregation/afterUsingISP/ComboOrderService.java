package com.company.SOLID.interfaceSegregation.afterUsingISP;

public class ComboOrderService implements ComboOrderInterface {

    @Override
    public void orderCombo(int quantity, int fries) {
        System.out.println("Received order of " +quantity+ " burger and " +fries+ "fries");
    }
}
