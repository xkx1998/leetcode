package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main_1007 {
    public static int minDominoRotations(int[] A, int[] B) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set1.add(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            set2.add(A[i]);
        }
        if (set1.size() == 1 || set2.size() == 1) return 0;

        int result1 = 0;
        Iterator it1 = set1.iterator();
        Iterator it2 = set2.iterator();

        int flag = 0;
        while (it1.hasNext()) {
            int num;
            num = (Integer) it1.next();
            int count = 0;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == num) continue;
                if (A[i] != num && B[i] == num) {
                    count++;
                }
                if (A[i] != num && B[i] != num) {
                    count = 0;
                    break;
                }
            }
            if (result1 == 0) result1 = count;
            if (result1 > count && count != 0) {
                result1 = count;
            }
        }
        int result2 = 0;
        while (it2.hasNext()) {
            int num;
            num = (Integer) it2.next();
            int count = 0;
            for (int i = 0; i < B.length; i++) {
                if (B[i] == num) continue;
                if (B[i] != num && A[i] == num) {
                    count++;
                }
                if (B[i] != num && A[i] != num) {
                    count = 0;
                    break;
                }
            }
            if (result2 == 0) result2 = count;
            if (result2 > count && count != 0) {
                result2 = count;
            }
        }
        if (result1 == 0 && result2 == 0) return -1;
        if (result1 == 0) return result2;
        if (result2 == 0) return result1;
        return result1 > result2 ? result2 : result1;
    }

    public static void main(String[] args) {
        int[] A = {2, 1, 2, 4, 2, 2};
        int[] B = {5, 2, 6, 2, 3, 2};
        System.out.println(minDominoRotations(A, B));
    }

}
