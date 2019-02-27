package com.katoch;

import com.katoch.combination.CombinationBackTracking;
import com.katoch.combination.CombinationIterative;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testCombination();
    }

    private static void testCombination() {
        CombinationBackTracking combination = new CombinationBackTracking();
        CombinationIterative combinationIterative = new CombinationIterative();

        int[] input = {1,2,3};
        System.out.println("subsets");
        System.out.println(combination.subsets(input));
        System.out.println("Iterative subsets");
        System.out.println(combinationIterative.subsets(input));
        //System.out.print("combinationSum");
        //combination.combinationSum(input);

    }
}
