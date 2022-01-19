package com.company.SOLID;

public class test {

    public static void main(String[] args) {
        String s1 = new String("A");
        String s2 = new String("A");

        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s2);//false
        System.out.println("A" == "A");//true
        System.out.println(10 == 10);//true
        System.out.println('a' == 97.0);
        System.out.println(true == true);

        Thread t1 = new Thread();
        Thread t2 = new Thread();

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);

        System.out.println(t1.equals(t2));//true

        System.out.println(1%5);
        System.out.println(4/5);

    }
}
