package com.company;

/**
 * 11. Container With Most Water
 */
public class Main_21 {
    public static int maxArea(int[] height) {
        int max = 0;
        int x;
        for(int i = 0; i < height.length-1;i++) {
            x = 0;
            for(int j = i+1;j < height.length;j++) {
                x = Math.min(height[i],height[j]);
                if(max < x*(j-i)) {
                    max = x*(j-i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
