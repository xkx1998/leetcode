package com.company;

import java.util.Arrays;

/**
 * 16. 3Sum Closest
 */
public class Main_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = 0;
        int min = Integer.MAX_VALUE;
        int cha;
        int sum;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                sum = nums[right] + nums[left] + nums[i];
                cha = Math.abs(sum - target);
                if (min > cha) {
                    min = cha;
                    closest = sum;
                }
                if (sum == target) {
                    return closest;
                } else if (sum < target) {
                    while (left < right && nums[left++] == nums[left]);
                } else {
                    while (left < right && nums[right--] == nums[right]);
                }
            }
        }
        return closest;
    }
}
