package com.company;

import java.util.Scanner;
import java.util.*;

public class Main_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] chs = new int[1024];
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            chs[str.charAt(i)]++;
        }
        Arrays.sort(chs);
        int sum = 0;
        for (int i = chs.length - 1; i >= 0; i--) {
            if(chs[i] < k) {
                sum += chs[i] * chs[i];
                k = k - chs[i];
                continue;
            }else if(chs[i] == k) {
                sum += chs[i] * chs[i];
                break;
            }else {
                sum += k * k;
                break;
            }
        }

        System.out.println(sum);

    }

}
