package com.company;


public class BubbleSort {
    /**
     * 冒泡排序
     * @param nums
     */
    public static void bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = 0; j < nums.length - 1 - i;j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,-1,2,-3,-5,1,10};
        bubbleSort(nums);
        for (int num:nums) {
            System.out.println(num);
        }
    }

}
