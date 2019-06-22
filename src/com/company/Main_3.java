package com.company;

import java.util.*;

public class Main_3 {
    //思路就是将最近出现的重复字符的位置保存起来为pre，然后pre和当前字符上一次出现的位置index作比较，
    //pre = Max(pre,index)
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0)
            return 0;
        Map<Character, Integer> map = new HashMap<>();

        //最近重复字符的位置
        int pre = -1;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            //记录这个字符上一次出现的位置
            Integer index = map.get(ch);

            if (index != null)
                //pre为重复字符的位置
                pre = Math.max(index, pre);
            max = Math.max(max, i - pre);
        }
        return max;
    }
}
