package com.company;

public class Main_1047 {
    public static String removeDuplicates(String S) {
        String str = S;
        String result = "";
        String pre = "";
        boolean b;
        for (; ; ) {
            b = true;
            result = "";
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    b = false;
                    if(str.length() - 1== i+1){
                        result += str.substring(0, i);
                    }else{
                        result += str.substring(0, i) + str.substring(i + 2);
                    }
                    pre = result;
                    System.out.println(result);
                    break;
                }
            }
            if(b) {
                return pre;
            }else {
                str = result;
            }
        }
    }

    public static void main(String[] args) {
        removeDuplicates("abbaca");
    }
}
