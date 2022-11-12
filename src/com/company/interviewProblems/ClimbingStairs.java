package com.company.interviewProblems;

public class ClimbingStairs {

    public static int minSteps(int stairs, int bigJump) {

        if(stairs <= 1) return stairs;

        return minSteps(stairs-1, bigJump) + minSteps(stairs - bigJump, bigJump);
    }

    public static int countStep(int stairs, int bigJump) {
        return minSteps(stairs, bigJump);
    }

    public static void main(String[] args) {
        System.out.println(countStep(4, 2));
    }
}
