package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 9. Palindrome Number
 */

public class Main_9 {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        List<Integer> list = new ArrayList<>();

        int temp;

        while (x > 0) {
            temp = x % 10;
            list.add(temp);
            x = x / 10;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == list.get(list.size() - i - 1)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
