package com.company;

import java.util.Arrays;

public class Main_1005 {
    public static int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        if(fushu(A) == 0) {
            if(K%2 == 0) return sum(A);
            else {
                A[0] = -1 * A[0];
                return sum(A);
            }
        }

        else {
            int fushu_num = fushu(A);
            if(fushu_num == K){
                for(int i = 0;i < fushu_num;i++) {
                    A[i] = A[i] * -1;
                }
                return sum(A);
            }
            else if(fushu_num < K) {
                for(int i = 0;i < fushu_num;i++) {
                    A[i] = A[i] * -1;
                }
                Arrays.sort(A);
                K = K - fushu_num;
                if(K%2 == 0) return sum(A);
                else {
                    A[0] = -1 * A[0];
                    return sum(A);
                }
            }
            else {
                for(int i = 0;i < K;i++) {
                    A[i] = A[i] * -1;
                }
                return sum(A);
            }
        }
    }

    public static int fushu(int []nums) {
        int num = 0;
        for(int i = 0 ;i < nums.length;i++) {
            if(nums[i] < 0) num++;
        }
        return num;
    }

    public static int sum(int []nums) {
        int sum = 0;
        for(int i = 0 ;i < nums.length;i++) {
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,4,4,4,6,3};
        System.out.println(largestSumAfterKNegations(nums,1));

    }
}
