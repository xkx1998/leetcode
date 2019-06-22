package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main_1030 {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        int sum = 0;
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] - o1[1] < o2[0] - o2[1]) {
                    return -1;
                } else if (o1[0] - o1[1] == o2[0] - o2[1]) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });

        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                sum += costs[i][0];
            } else {
                sum += costs[i][1];
            }
        }

        return sum;
    }
}
