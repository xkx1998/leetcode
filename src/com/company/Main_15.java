package com.company;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 3Sum
 * 回溯超时
 * 二分查找
 */
public class Main_15 {
    public List<List<Integer>> threeSum() {
        int[] nums = new int[2019];

        List<List<Integer>> lists = new ArrayList<>();

        if (nums == null || nums.length < 3)
            return lists;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;
            int sum = -nums[i];
            while (left < right) {
                if (nums[left] + nums[right] == sum) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    lists.add(list);

                    while(left < right && nums[left++] == nums[left]){};
                    while(left < right && nums[right--] == nums[right]){};
                }

                else if(nums[left] + nums[right] < sum) {
                    while(left < right && nums[left++] == nums[left]){};
                }
                else {
                    while(left < right && nums[right--] == nums[right]){};
                }
            }
        }
        return lists;

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> tempList = new ArrayList<>();
        Arrays.sort(nums);
        backtrce(list, tempList, nums, 0);
        return list;
    }

    public void backtrce(List<List<Integer>> lists, List<Integer> clist, int[] nums, int start) {
        if (clist.size() == 3) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += clist.get(i);
            }
            if (sum == 0)
                lists.add(new ArrayList<>(clist));
            return;
        } else {
            for (int i = start; i < nums.length; i++) {
                clist.add(nums[i]);
                backtrce(lists, clist, nums, i + 1);
                clist.remove(clist.size() - 1);
            }
        }
    }
}
