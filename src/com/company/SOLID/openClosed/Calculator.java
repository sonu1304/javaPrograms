package com.company.SOLID.openClosed;

public class Calculator {

    //without using open-closed principle
//    public void calculate(Object operation) throws Exception{
//        if(operation == null)
//            throw new Exception("can not perform operation");
//        if(operation instanceof Addition) {
//            //type casting
//            Addition addition = (Addition) operation;
//            addition.result = addition.a + addition.b;
//        }
//        else if (operation instanceof Substraction) {
//            Substraction substraction = (Substraction) operation;
//            substraction.result = substraction.a - substraction.b;
//        }
//
//        else if(operation instanceof Multiplication) {
//            Multiplication multiplication = (Multiplication) operation;
//            multiplication.result = multiplication.a * multiplication.b;
//        }
//    }


    //using open-closed principle

    public void calculate(Operation operation) throws Exception{
        if(operation == null)
            throw new Exception("can not perform operation");
        operation.perform();
    }

    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        //to perform addition operation
        Addition addition = new Addition(20, 10);
        calculator.calculate(addition);
        System.out.println("Addition : " + addition.result);

        //performing substraction operations
        Substraction substraction = new Substraction(20,10);
        calculator.calculate(substraction);
        System.out.println("substraction : " + substraction.result);

        //performing multiplication
        Multiplication multiplication = new Multiplication(20,10);
        calculator.calculate(multiplication);
        System.out.println("Multiplication : " + multiplication.result);

    }


}
