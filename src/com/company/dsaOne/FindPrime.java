package com.company.dsaOne;

import java.util.Arrays;

/***
 * Sieve of Eratosthenes
 *
 * The sieve of Eratosthenes is one of the most efficient ways to find all primes smaller
 * than n when n is smaller than 10 million or so
 */

public class FindPrime {

    public static void allPrime(int n) {
        //create boolean array...

        boolean [] prime = new boolean[n+1];

        Arrays.fill(prime,true);

        prime[0] = false;
        prime[1] = false;

        for(int i = 2; i*i <= n; i++) {

            //checking for all multiples of i

            for (int j = 2*i; j <= n; j += i)
                prime[j] = false;
        }

        //printing the only prime numbers
        int count = 0;
        for (int i = 2; i<= n; i++) {
            if(prime[i]) {
                System.out.println(i);
                count++;
            }
            System.out.println(count);
        }

    }

    public static void main(String[] args) {

        allPrime(2);
    }
}
