package com.company.leetCode;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int [] a = {2,6,3,9,4,6,2,7,6,4,0,3};

        for (int i = 0; i < a.length - 2; i+= 3) {
            Arrays.sort(a, i,i+3);

        }

        for(int num : a) {
            System.out.print(num+ " ");
        }

//        public int [] sortEle(int [], int l, int h) {
//
//        }

    }
}
