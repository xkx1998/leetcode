package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main_77 {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        backtrace(0,nums,k);
        return lists;
    }

    public void backtrace(int start, int[] nums, int k) {
        if (list.size() == k) {
            lists.add(new ArrayList<>(list));
            return;
        } else {
            for (int i = start; i < nums.length; i++) {
                list.add(nums[i]);
                backtrace(i + 1, nums, k);
                list.remove(list.size() - 1);
            }
        }
    }


}
