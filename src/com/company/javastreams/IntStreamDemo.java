package com.company.javastreams;


import java.util.stream.IntStream;

public class IntStreamDemo {

    public static void main(String[] args) {

        IntStream.range(1,10)
                .forEach(System.out::print); // o/p - 123456789

        System.out.println();

        IntStream.range(1,10)
                .skip(5) // this will skip firs 5 elements
                .forEach(item -> System.out.println(item)); // 6789

        // print the sum
        int res = IntStream.range(1, 5)
                            .sum();
        System.out.println(res);

    }
}
