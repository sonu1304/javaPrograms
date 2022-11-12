package com.company.test;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.HashMap;
import java.util.Map;

public class Test {

    int age;
    String name;

    public Test(int age, String name) {
        this.age = age;
        name = name;
    }

    public static int fun(int a, int b) {

        if (b == 0)
            return a;
        else
            return fun(a, a % b);
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        Test t = new Test(22, "sonu");

//        System.out.println("rem "+1%3);

//        System.out.print(t.age);

        String s1 = "test";
        String s2 = "test";

        String s3 = s1.toUpperCase();

        System.out.println(s1.equals(s2));
        System.out.println("s1 -> "+s1);
        System.out.println("s2 -> "+s2);
        System.out.println("s3 -> "+s3);
//
//        Map<String, String> map = new HashMap<>();
//        String name = "name";
//
//        int h ;
//
////        System.out.println("h ---> " + h);
////        System.out.println(h >>> 16);
////        System.out.println("right Shift -- > " + (5 >>> 1));
//
//        System.out.println((name == null) ? 0 : (h = name.hashCode()) ^ (h >>> 16));
//        int sum = 0;
//        int i = 0;
//
//        while ( i < 100) {
//            sum = sum + i;
//            sum = i + sum;
//            i += 1;
//        }

//        System.out.println(2 % 1);
//
//
//        HashMap map = new HashMap();
//
//        map.put(1, 2);
//        Object v = map.put(1, 3);
//        map.put(4, null);
//        map.put(2, 2);
//        map.put(3, 3);
//
//        System.out.println(v);


    }
}
