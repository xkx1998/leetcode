package com.company;

import java.util.Arrays;

public class Main_31 {
    public void nextPermutation(int[] nums) {
        int first = -1;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i - 1] < nums[i]) {
                first = i - 1;
                break;
            }
        }
        if (first == -1) {
            Arrays.sort(nums);
            return;
        }
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for (int i = first + 1; i < nums.length; i++) {
            if (nums[i] <= nums[first]) {
                continue;
            } else {
                if (nums[i] < min) {
                    min = nums[i];
                    min_index = i;
                }
            }
        }
        swap(nums, first, min_index);
        Arrays.sort(nums, first + 1, nums.length);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
