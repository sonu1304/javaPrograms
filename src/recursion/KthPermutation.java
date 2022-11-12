package recursion;

import java.util.ArrayList;
import java.util.List;

/**

 The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

 By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

 "123"
 "132"
 "213"
 "231"
 "312"
 "321"
 Given n and k, return the kth permutation sequence.

 TC = O(N^2)
 SC = O(N)

 */

public class KthPermutation {
    public static void main(String[] args) {
        int n = 4;
        int fact = 1;
        int k = 17;
        List<Integer> numbers = new ArrayList<>();
        String ans = "";
        for (int i = 1; i < n; i++) {
            fact = fact*i;
            numbers.add(i);
        }
        numbers.add(n);

        k = k -1;

        while (true) {
            ans = ans + numbers.get(k/fact);
            numbers.remove(k/fact);
            if(numbers.size() == 0) break;

            k = k % fact;
            fact = fact / numbers.size();
        }
        System.out.println(ans);
    }
}
