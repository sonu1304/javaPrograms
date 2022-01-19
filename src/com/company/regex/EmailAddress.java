package com.company.regex;

import java.util.ArrayList;

public class EmailAddress {
    public static void main(String[] args) {

        String str = "-abc-";
        System.out.println(str.matches("^$|^[a-zA-Z0-9-]+$"));
    }

}