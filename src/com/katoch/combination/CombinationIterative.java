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
        List<Integer> tempList = new ArrayList<>();
        Arrays.sort(nums);

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(null);
        int start = 0;

        while( !stack.isEmpty() ) {
            Integer val = stack.pop();
            if (val != null) tempList.add(val);
            list.add(new ArrayList<>(tempList));

            //tempList = new ArrayList<>();
            if ( start < nums.length ) {

                stack.push(nums[start]);
                start++;
                //break;
            } else {
                start--;
                stack.push(nums[start]);

                tempList.remove(tempList.size() - 1);
            }
        }
        return list;
    }

}
