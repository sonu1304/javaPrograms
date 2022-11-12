package com.company.SOLID.interfaceSegregation.afterUsingISP;

public class FriesOrderService implements FriesOrderInterface{

    @Override
    public void orderFries(int fries) {
        System.out.println("Received order of " +fries+ "fries");
    }

}
