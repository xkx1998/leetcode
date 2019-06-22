package com.company;

public class QuickSort {

    public static void quickSort(int[] nums, int left, int right) {
        int _left = left;
        int _right = right;
        int temp = 0;

        if (_left < _right) {
            temp = nums[_left];
            while (_left != _right) {
                while (_left < _right && nums[_right] >= temp)
                    _right--;
                nums[_left] = nums[_right];

                while (_left < _right && nums[_left] <= temp)
                    _left++;
                nums[_right] = nums[_left];
            }

            nums[_right] = temp;
            quickSort(nums, left, _left - 1);
            quickSort(nums, _right+1, right );
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,4,5,3,1,7,8,2,1,4,5,4,5,4,7,8,7,8,7,1};
        quickSort(nums,0,nums.length-1);

        for (int i:nums) {
            System.out.println(i);
        }
    }
}
