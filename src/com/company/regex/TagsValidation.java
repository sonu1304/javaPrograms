package com.company.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagsValidation {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[<>/]");
        Matcher m = p.matcher("<A>this is code</A>");
        while(m.find() ) {
            System.out.println(m.group());
        }

        String str = "<a>this is future</a>";
        String res = str.replaceAll("\\<.*?>","");
        System.out.println(res);
     }
    
}