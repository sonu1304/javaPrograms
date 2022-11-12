package com.company.regex;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {

        //this class use default pattern is space i.e \\s
        StringTokenizer str = new StringTokenizer("I love to code");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
    }
}
