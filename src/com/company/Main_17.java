package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main_17 {
    public static List<String> letterCombinations(String digits) {
        String[] table = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list = new ArrayList<>();
        backtrace(digits,0,"",list,table);
        return list;
    }

    public static void backtrace(String digist,int index,String curr,List<String> list,String[] table) {
        if(index == digist.length()) {
            if(curr.length()!=0)
                list.add(curr);
            return;
        }

        String temp = table[digist.charAt(index)-'0'];
        for(int i = 0;i <temp.length();i++) {
            String next = curr + temp.charAt(i);
            backtrace(digist,index+1,next,list,table);
        }
    }
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}

