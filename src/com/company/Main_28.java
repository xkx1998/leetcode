package com.company;

public class Main_28 {
    public static int strStr(String haystack, String needle) {
        if(needle == null || needle.isEmpty()) return 0;
        if(needle.length() > haystack.length()) return -1;
        for(int i = 0;i < haystack.length();i++) {
            int temp = i;
            int count = 0;
            for(int j = 0;j<needle.length();j++) {
                if(i < haystack.length() && haystack.charAt(i) == needle.charAt(j))
                {
                    i++;
                    count++;
                    continue;
                }else break;
            }
            if(count == needle.length()){
                return temp;
            }else {
                i = temp;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi"
                ,"mississippi"));
    }
}
