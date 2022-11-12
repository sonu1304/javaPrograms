package com.company.regex;

import java.util.regex.Pattern;

public class Splitmethod1 {

    public static void main (String[] a) {
//        Pattern p = Pattern.compile("\\.");
        Pattern p = Pattern.compile("[.]");       // same o/p for both cases..
        String [] s = p.split("www.google.com");
        for (String res : s)
            System.out.println(res);
    }
}
