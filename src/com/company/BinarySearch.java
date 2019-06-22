package com.company;

public class BinarySearch {

    /**
     * 二分查找
     * @param A
     * @param target
     * @param n
     * @return
     */
    public int binarySearch(int[] A, int target, int n) {
        int low = 0;
        int height = n;
        int mid;
        while (low <= height) {
            mid =(height + low) / 2;
            if (A[mid] == target) return mid;
            if (target > A[mid]) low = mid + 1;
            if (target < A[mid]) height = mid - 1;
        }
        return -1;
    }

}
