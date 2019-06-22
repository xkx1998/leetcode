package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main_1029 {
    public static List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new LinkedList<>();
        int temp;
        if (A[0]  == 0) {
            temp = 0;
            result.add(true);
        } else {
            temp = 1;
            result.add(false);
        }

        for (int i = 1; i < A.length; i++) {
            if (A[i] == 1) {
                temp = temp * 2 + 1;
            } else {
                temp *= 2;
            }

            result.add(temp % 5 == 0);
            temp %= 5;
        }


        return result;
    }

    public static void main(String[] args) {
        int []A = {0,1,1,1,1,1};
        System.out.println(prefixesDivBy5(A));
    }
}
