package com.company.regex;

public class ValidatePostalCode {
    public static void main(String[] args) {
        
        String str = "a1245";
        System.out.println(str.matches("^\\d{5}(?:-\\d{4})?$"));
    }
    
}
