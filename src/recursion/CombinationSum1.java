package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations
 of candidates where the chosen numbers sum to target. You may return the combinations in any order.

 The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
 frequency of at least one of the chosen numbers is different.

 It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations
 for the given input.



 Example 1:

 Input: candidates = [2,3,6,7], target = 7
 Output: [[2,2,3],[7]]
 Explanation:
 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 7 is a candidate, and 7 = 7.
 These are the only two combinations.

 */

public class CombinationSum1 {

    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        System.out.println(combinationSum(arr, 7));

    }

    private static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findSum(0,arr,target, ans, new ArrayList<>());
        return ans;
    }

    private static void findSum(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        //base case
        if(index == arr.length) {
            if(target == 0) ans.add(new ArrayList<>(ds));
            return;
        }

        //pin condition
        if(arr[index] <= target) {
            ds.add(arr[index]);
            findSum(index, arr, target-arr[index], ans, ds);
            //backtrack
            ds.remove(ds.size()-1);
        }

        //non - pic

        findSum(index+1, arr, target, ans, ds);
    }

}
