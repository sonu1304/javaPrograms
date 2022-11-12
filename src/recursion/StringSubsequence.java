package recursion;

// get the subsequence of string

import java.util.ArrayList;
import java.util.List;

public class StringSubsequence {

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(getSubsequence(str));

        System.out.println(findSubsequence(str));
    }

    private static ArrayList<String> getSubsequence(String str) {

        //base case
        if(str.length() == 0) {
            ArrayList<String> bs = new ArrayList<>();
            bs.add("");
            return bs;
        }

        //getting 0th char
        char ch = str.charAt(0);
        // remaining string
        String ros = str.substring(1);

        //recursive call

        ArrayList<String> res = getSubsequence(ros);

        //creating final ans list
        ArrayList<String> ansList = new ArrayList<>();

        //without first char

        for(String st : res) ansList.add(""+st);

        //with first char
        for(String st : res) ansList.add(ch + st);

        return ansList;

    }

    private static List<List<String>> findSubsequence(String str) {
        List<String> ds = new ArrayList<>();
        List<List<String>> ansList = new ArrayList<>();
        getSubsequence(0, str, ansList, ds);
        return ansList;
    }

    public static void getSubsequence(int index, String str, List<List<String>> ansList, List<String> ds) {
        ansList.add(new ArrayList<>(ds));

        for(int i = index; i < str.length(); i++) {
            //checking duplicate subsequence
            if(i!= index && str.charAt(i) == str.charAt(i-1)) continue;

            //pic
            ds.add(String.valueOf(str.charAt(i)));

            //recursive call
            getSubsequence(i + 1, str, ansList, ds);

            //backtrack
            ds.remove(ds.size() - 1);
        }
    }
}


