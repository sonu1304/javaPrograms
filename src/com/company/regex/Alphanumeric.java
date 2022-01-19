package com.company.regex;

import java.util.regex.Pattern;
import java.util.*;
import java.text.*;

public class Alphanumeric {
    public static void main(String[] args) {
        // Pattern p = Pattern.compile("")

        long timeSec = 1372339860;
        // Date date = new Date(timeSec * 1000l);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String formatedDate = sdf.format(date.getTime());
        System.out.println(formatedDate);


        // String str = "abc";
        // System.out.println(str.matches("^\\w+?-$"));

        
        
    }
    
}