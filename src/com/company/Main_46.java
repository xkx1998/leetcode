package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_46 {
    List<Integer> tempList = new ArrayList<>();
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        fun(0, nums);
        return list;
    }

    public void fun(int start, int[] nums) {
        if (start == nums.length - 1) {
            for (int i : nums) {
                tempList.add(i);
            }
            list.add(new ArrayList<>(tempList));
            tempList.clear();
        }
        for (int i = start; i < nums.length; i++) {
            swap(i, start, nums);
            fun(start + 1, nums);
            swap(i, start, nums);
        }
    }

    public void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
