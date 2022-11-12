package com.company.interviewProblems;

public class Bookworm {

    public int countDigits(int num ) {
        int count = 0;
        if ( num == 0) return -1;

        for (int i = 1; i <=num; i++) {
            if( i <= 9)
                count++;
            else {
                int n = i;
                //now count the number of digit
//                while(n!=0) {
//
//                    n = n / 10;
//
//                    count++;
//
//                }

                //count digit using log base 10
//                count  += (int)Math.floor(Math.log10(i) + 1);

                // using string

                String s = Integer.toString(i);

                count += s.length();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Bookworm book = new Bookworm();
        System.out.println(book.countDigits(13));
    }
}
