package com.company.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClasses {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d");
        Matcher m = p.matcher("a7b k@9");
        while (m.find()) {
            System.out.println(m.start() + " ... " + m.group());
        }
    }
}
