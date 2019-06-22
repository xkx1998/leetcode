package com.company;

import java.util.HashSet;

public class Main_202 {
    public static boolean isHappy(int n) {
        int num = n;
        int s_num = 0;
        HashSet<Integer> set = new HashSet<>();
        while (set.add(num)) {
            s_num = 0;
            while (num > 0) {
                int temp = num % 10;
                s_num += temp * temp;
                num /= 10;
            }
            if(s_num == 1) return true;
            num = s_num;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
