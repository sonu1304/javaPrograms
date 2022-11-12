package com.company.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m = p.matcher("9742601452");
        if(m.find() && m.group().equals("9742601452")) 
            System.out.println("Valid number...");
        else 
            System.out.println("Invalid number");    
    }

}