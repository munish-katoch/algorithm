package com.katoch.combination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CombinationIterative {
    /*
        public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
     */

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(null);
        int start = 0;

        while( !stack.isEmpty() ) {
            Integer val = stack.pop();
            List<Integer> tempList = new ArrayList<>();
            for(int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                //backtrack(list, tempList, nums, i + 1);
                start = i+1;
                if (i+1 <= nums.length-1) stack.push(nums[i+1]);
                tempList.remove(tempList.size() - 1);
            }
            list.add(new ArrayList<>(tempList));
        }
        return list;
    }

}
