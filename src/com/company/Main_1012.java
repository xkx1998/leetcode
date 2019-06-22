package com.company;

public class Main_1012 {
    public static int bitwiseComplement(int N) {
        String str = Integer.toBinaryString(N);
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            if (chs[i] == '1') {
                chs[i] = '0';
            } else {
                chs[i] = '1';
            }
        }

        int num = 1;
        int sum = 0;
        for (int i = chs.length - 1; i >= 0; i--) {
            if (chs[i] == '1') {
                sum += num;
            }
            num *= 2;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(bitwiseComplement(10));
    }
}
