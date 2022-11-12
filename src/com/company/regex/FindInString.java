package com.company.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindInString {

    public static void main(String[] args) {

        int count = 0;
        Pattern p = Pattern.compile("ab");
        Matcher m = p.matcher("ababbaba");
        while (m.find()) {
            count++;
//            System.out.println(m.start());
            System.out.println(m.start() +" ... " + m.end()+" ... "+ m.group());
        }
        System.out.println("count =  "+count);
    }
}
