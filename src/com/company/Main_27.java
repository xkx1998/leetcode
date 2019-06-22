package com.company;

/**
 * 27. Remove Element
 */

public class Main_27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
