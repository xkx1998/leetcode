package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main_1031 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] arr = new int[R * C][2];
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[index][0] = i;
                arr[index++][1] = j;
            }
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int sum1 = Math.abs(o1[0] - r0)+Math.abs(o1[1] - c0);
                int sum2 = Math.abs(o2[0] - r0)+Math.abs(o2[1] - c0);
                if (sum1 < sum2) {
                    return -1;
                } else if (sum1 == sum2) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        return arr;
    }
}
