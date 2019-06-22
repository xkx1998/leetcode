package com.company;

import java.util.*;

/**
 * 49. Group Anagrams
 */

public class Main_49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        String[] s = strs;
        Set<String> set = new HashSet<>();
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            char[] chars = s[i].toCharArray();
            Arrays.sort(chars);
            String s1 = new String(chars);
            set.add(s1);
        }

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s2 = it.next();
            List<String> list = new ArrayList<>();
            for (int j = 0; j < strs.length; j++) {
                char[] chars = strs[j].toCharArray();
                Arrays.sort(chars);
                String s1 = new String(chars);
                if (s2.equals(s1)) {
                    list.add(strs[j]);
                }
            }
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(strs);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("=================");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.println(list.get(i).get(j));
            }
        }

    }
}
