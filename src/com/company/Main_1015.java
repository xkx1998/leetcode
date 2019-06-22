package com.company;

import java.util.LinkedHashMap;

public class Main_1015 {
    public static int numDupDigitsAtMostN(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            char[] chs = s.toCharArray();
            LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
            for (char c : chs) {
                if (map.containsKey(c)) {
                    result++;
                    break;
                } else {
                    map.put(c, 1);
                }
            }
            map.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numDupDigitsAtMostN(100));
    }
}
