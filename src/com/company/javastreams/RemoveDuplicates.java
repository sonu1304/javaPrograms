package com.company.javastreams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String [] ar) {

        /** using distinct() method */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,1,3,4,5,5,3,4));

//        List<Integer> list = Arrays.asList(1,2,2,1,3,4,5,5,3,4);

       List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list1);


        Arrays.stream(new int[] {1,2,2,3,4,1}).distinct().forEach(System.out::println);

        /**
         * using toSet()
         */


        Set<Integer> set = list1.stream().collect(Collectors.toSet());
        System.out.println(set);

        /**
         * using toMap() to count occurances
         *
         * Sometimes, we are interested in finding out that which all elements are duplicates and how many times
         * they appeared in the original list. We can use a Map to store this information.
         *
         * We have to iterate over the list, put element as the map key, and all its occurrences in the map value field.
         */


        Map<Integer, Long> map = list.stream()
                .collect(Collectors.toMap(Function.identity(),v->1L, Long::sum));
        System.out.println(map);
    }
}
