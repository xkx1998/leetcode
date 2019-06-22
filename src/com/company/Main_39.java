package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. Combination Sum
 * 递归回溯
 */

public class Main_39 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        backtrace(lists, list, candidates, target, 0);
        return lists;
    }

    public static boolean backtrace(List<List<Integer>> lists,
                                    List<Integer> tempList, int[] nums, int remain, int start) {

        if (remain < 0) {
            return false;
        } else if (remain == 0) {
            lists.add(new ArrayList<>(tempList));
            return false;
        } else {
            for (int i = start; i < nums.length; i++) {
                boolean flag;
                tempList.add(nums[i]);
                flag = backtrace(lists, tempList, nums, remain - nums[i], i);
                tempList.remove(tempList.size() - 1);

                if (!flag) {
                    break;
                }
            }

            return true;
        }

    }

    public static void main(String[] args) {

    }
}
