package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main_18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        if (nums.length < 4 || nums == null) return lists;

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        lists.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left <right && nums[left++] == nums[left]) {}
                        while(left < right && nums[right--] == nums[right]){}
                    }

                    else if(sum < target){
                        while(left <right && nums[left++] == nums[left]) {}
                    }
                    else {
                        while(left < right && nums[right--] == nums[right]){}
                    }
                }
            }
        }
        return lists;
    }
}
