package com.company;

public class Main_1032 {
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        return Math.max(maxSum(A, L, M), maxSum(A, M, L));
    }

    public int maxSum(int[] A, int L, int M) {
        int len = A.length;
        int res = 0;
        int rightmost = len - M;
        int leftmost = len - M - L;

        for (int i = 0; i <= leftmost; i++) {
            for (int j = i + L; j <= rightmost; j++) {
                res = Math.max(res, sum(i, A, L) + sum(j, A, M));
            }
        }
        return res;
    }

    public int sum(int start, int[] A, int l) {
        int res = 0;
        for (int i = start; i <= start + l - 1; i++) {
            res += A[i];
        }
        return res;
    }


}
