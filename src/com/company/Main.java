package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] strs = new String[T];
        for(int i = 0;i < T;i++) {
            strs[i] = sc.next();
        }
        int[] result = new int[T];
        int[] nums = new int[T];
        for(int i = 0;i < nums.length;i++) {
            nums[i] = 1;
        }
        for(int i = 0;i < strs.length;i++) {
            String str = strs[i];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o') {
                    nums[i]++;
                }
            }
        }
    }
}