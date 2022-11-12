package com.company.SOLID.openClosed;

public class Multiplication implements Operation {

    int a;
    int b;
    int result = 0;

    Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void perform() {
        this.result = this.a * this.b;
    }
}
