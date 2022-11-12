package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**

 Given an integer array nums of unique elements, return all possible subsets (the power set).

 The solution set must not contain duplicate subsets. Return the solution in any order.



 Example 1:

 Input: nums = [1,2,3]
 Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 Example 2:

 Input: nums = [0]

 */

public class SubSets2 {
    public static void main(String[] args) {

        int [] nums = {3,1,1,2};
        Arrays.sort(nums);
        System.out.println(subSets(nums));

    }

    private static List<List<Integer>> subSets(int [] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findSubSets(0,nums,ansList,ds);
        return ansList;
    }

    private static void findSubSets(int index, int [] arr, List<List<Integer>> ansList, List<Integer> ds) {
        ansList.add(new ArrayList<>(ds));
        for(int i = index; i < arr.length; i++) {
            //condition for duplicate
            if(i != index && arr[i] == arr[i-1]) continue;

            //pic
            ds.add(arr[i]);

            //recursive call
            findSubSets(i+1, arr, ansList, ds);

            //bactrack
            ds.remove(ds.size()-1);
        }
    }
}
