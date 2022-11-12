package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**

 Given a list arr of N integers, print sums of all subsets in it.

 Note: Return all the element is increasing order.

 Example 1:

 Input:
 N = 2
 arr[] = {2, 3}
 Output:
 0 2 3 5
 Explanation:
 When no elements is taken then Sum = 0.
 When only 2 is taken then Sum = 2.
 When only 3 is taken then Sum = 3.
 When element 2 and 3 are taken then
 Sum = 2+3 = 5.

 TC - 2^n + 2^n log(2^n)

 */

public class SubSetsSum1 {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);

        int N = 3;

        System.out.println(subSetSums(arr, N));

    }

    private static List<Integer> subSetSums(List<Integer> arr, int N) {
        List<Integer> ans = new ArrayList<>();
        findSum(0, 0, arr, ans, N);
        Collections.sort(ans);
        return ans;
    }

    private static void findSum(int index, int sum, List<Integer> arr, List<Integer> ans, int N) {
        //base case
        if(index == N) {
            ans.add(sum);
            return;
        }

        //pic elements
        findSum(index+1, sum+arr.get(index), arr, ans, N);

        //non- pic
        findSum(index+1, sum, arr, ans, N);
    }

}
