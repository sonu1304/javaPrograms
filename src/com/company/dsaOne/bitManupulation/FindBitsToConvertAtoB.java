package com.company.dsaOne.bitManupulation;

public class FindBitsToConvertAtoB {

    public static void main(String[] args) {

        int a = 22;
        int b = 27;

        // fist XOR  a and b

        int n = a ^ b;

        int count = 0;

//        while (n > 0) {
//            count++;
//            n = n & (n-1);
//        }

//        while ( n > 0) {
//
//            n = n >> 1;
//
//            if ( (n & 1) == 1)
//                count++;
//
//        }

        System.out.println(count);

        //comp - O(number of set bit)

    }
}
