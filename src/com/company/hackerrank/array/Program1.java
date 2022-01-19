package com.company.hackerrank.array;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int index_0 = s.nextInt();
        int arr[] = new int[size];
        arr[0] = index_0;
        int count = index_0 < 0 ? 1 : 0;

        for(int i = 1; i < size; i++) {
            int num = s.nextInt();
            arr[i] = arr[i-1] + num;
            if(arr[i] < 0)
                count++;
            for( int j = 0; j < i; j++) {
                int res = arr[i] - arr[j];
                if( res < 0 )
                    count++;
            }
        }
        s.close();
        System.out.println(count);
    }
    
}