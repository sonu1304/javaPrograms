package com.company.SOLID.interfaceSegregation;

public interface OrderService {

    void orderBurger(int quantity);
    void orderFries(int fries);
    void orderCombo(int quantity, int fries);
}
