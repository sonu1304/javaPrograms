package com.company.regex;

import java.util.StringTokenizer;

public class StringTokenizerClass1 {

    public static void main(String[] a) {
        StringTokenizer str = new StringTokenizer("23-04-2020", "-");
        while (str.hasMoreTokens())
            System.out.print(str.nextToken());
        // o/p ----

//        23
//        04
//        2020
    }
}
