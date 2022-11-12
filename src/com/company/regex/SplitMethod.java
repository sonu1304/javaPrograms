package com.company.regex;

import java.util.regex.Pattern;

public class SplitMethod {

    public static void main (String[] a) {
        Pattern p = Pattern.compile("\\s");
//        Pattern p = Pattern.compile("o");
        String [] s = p.split("I love to code");
        for (String res : s)
            System.out.println(res);
    }

}
