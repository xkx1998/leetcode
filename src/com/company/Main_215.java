package com.company;

import java.util.Arrays;

public class Main_215 {
    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return -1;
        }
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums,4));
    }
}
