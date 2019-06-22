package com.company;

public class Main_1089 {
    public static void duplicateZeros(int[] arr) {
        int[] nums = new int[arr.length * 2];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            nums[index++] = arr[i];
            if (arr[i] != 0) {
                continue;
            } else {
                nums[index++] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        /*for (int i = 0; i < index; i++) {
            System.out.print(" " + nums[i] + " ");
        }*/
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
    }
}
