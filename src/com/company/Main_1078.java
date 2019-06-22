package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main_1078 {
    public static String[] findOcurrences(String text, String first, String second) {
        int index = 0;
        String pre = first + " " + second;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            boolean flag = true;
            index = i;
            for (int j = 0; j < pre.length(); j++) {
                if (index < text.length() && text.charAt(index++) == pre.charAt(j)) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(index);
                StringBuffer sb = new StringBuffer("");
                int count = 0;
                for (int z = index; z < text.length(); z++) {
                    if (text.charAt(z) == ' ' && count < 1) {
                        count++;
                        continue;
                    } else if (text.charAt(z) != ' ') {
                        sb.append(text.charAt(z));
                    } else {
                        break;
                    }
                }
                if (sb.length() > 0)
                    list.add(sb.toString());
                i = index - 1;
            }else {
                i = index - 2;
            }


        }

        String[] result = new String[list.size()];
        int i = 0;
        for (String s : list) {
            result[i++] = s;
        }
        return result;
    }

    public static void main(String[] args) {
        findOcurrences("alice is a good girl she is a good student", "a", "good");
    }
}
