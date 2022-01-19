package com.company.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program1 {
    public static void main(String [] args ) {
        // find alphanumeric character

        Pattern p = Pattern.compile("[a-zA-Z0-9]");
        Matcher m = p.matcher("a7b@z#9");

        while (m.find()) {
            System.out.println(m.start() + " ... " + m.group());
        }
    }
}
