package com.company;

public class Main_69 {
    public int mySqrt(int x) {
        int i = 1; // [1 ... i-1] contains v*v <= x
        int j = x; // [j+1 ... x] contains v*v > x

        while (i <= j) {
            long mid = i + (j - i) / 2;
            if (mid * mid <= x) {
                i = (int)mid + 1; // Expend left interval
            } else {
                j = (int)mid - 1; // Expend right interval
            }
        }
        return i - 1;
    }
}
