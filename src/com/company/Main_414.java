package com.company;

public class Main_414 {
    public static int thirdMax(int[] nums) {
        if(nums == null) return -1;
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == max1 || nums[i] == max2 || nums[i] == max3)
                continue;
            if (max1 < nums[i]) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (max2 < nums[i]) {
                max3 = max2;
                max2 = nums[i];
            } else if (max3 < nums[i]) {
                max3 = nums[i];
            }
        }

        if (nums.length < 3) {
            return (int) max1;
        }
        if(max3 == Long.MIN_VALUE) {
            return (int) max1;
        }
        return (int) max3;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(thirdMax(nums));
    }
}
