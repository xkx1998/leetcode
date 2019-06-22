package com.company;

public class Main_12 {

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        String str = String.valueOf(num);
        int temp1 = num % 10;
        int temp2 = num / 10 % 10;
        int temp3 = num / 100 % 10;
        int temp4 = num / 1000 % 10;
        int len = str.length();
        if (len == 1) {
            return fun1(temp1);
        } else if (len == 2) {
            return fun2(temp2) + fun1(temp1);
        } else if (len == 3) {
            return fun3(temp3) + fun2(temp2) + fun1(temp1);
        } else {
            return fun4(temp4) + fun3(temp3) + fun2(temp2) + fun1(temp1);
        }
    }

    public static String fun1(int num) {
        if (num < 5) {
            if (num == 4) return "IV";
            String result = "";
            for (int i = 0; i < num; i++) {
                result += "I";
            }
            return result;
        } else if (num == 5) {
            return "V";
        } else {
            if (num == 9) return "IX";
            String result = "V";
            for (int i = 0; i < num - 5; i++) {
                result += "I";
            }
            return result;
        }
    }

    public static String fun2(int num) {
        if (num < 5) {
            if (num == 4) return "XL";
            String result = "";
            for (int i = 0; i < num; i++) {
                result += "X";
            }
            return result;
        } else if (num == 5) {
            return "L";
        } else {
            if (num == 9) return "XC";
            String result = "L";
            for (int i = 0; i < num - 5; i++) {
                result += "X";
            }
            return result;
        }
    }

    public static String fun3(int num) {
        if (num < 5) {
            if (num == 4) return "CD";
            String result = "";
            for (int i = 0; i < num; i++) {
                result += "C";
            }
            return result;
        } else if (num == 5) {
            return "D";
        } else {
            if (num == 9) return "CM";
            String result = "D";
            for (int i = 0; i < num - 5; i++) {
                result += "C";
            }
            return result;
        }
    }

    public static String fun4(int num) {
        String str = "";
        for (int i = 0; i < num; i++) {
            str += "M";
        }
        return str;
    }
}
