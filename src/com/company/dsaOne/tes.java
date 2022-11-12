package com.company.dsaOne;

import java.util.Scanner;
import java.util.StringTokenizer;

public class tes {
    public static void main(String[] args) {
//        System.out.println(Integer.parseInt("2")/1);

//        Scanner s = new Scanner(System.in);

        String str = "how are you";

        String str2 = "abo";

        StringTokenizer res = new StringTokenizer(str,str2);
        while (res.hasMoreTokens())
            System.out.print(res.nextToken());

//        String res = str.

//        char[] ar = str2.toCharArray();
//        String res="";
//        for (int i = 0; i < ar.length; i++) {
//           res = str.replace(ar[i] , ' ');
//           str = res;
//        }

//       String s = res.trim().replaceAll("\\s{2,}", " ");

//        System.out.println(s);
    }
}
