package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main_1094 {
    public static boolean carPooling(int[][] trips, int capacity) {
        int peopleNum = 0;
        for (int i = 0; i < trips.length - 1; i++) {
            for (int j = i + 1; j < trips.length; j++) {
                if (trips[i][1] > trips[j][1]) {
                    int[] temp = trips[i];
                    trips[i] = trips[j];
                    trips[j] = temp;
                }
            }
        }

        /*for (int i = 0; i < trips.length; i++) {
            System.out.println(trips[i][0] + ":" + trips[i][1] + ";" + trips[i][2]);
        }*/
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < trips.length; i++) {
            Iterator it = list.iterator();
            while(it.hasNext()) {
                int num = (int) it.next();
                if (trips[num][2] <= trips[i][1]) {
//                    System.out.println(i + ":" + num + "-" + trips[num][0]);
                    peopleNum -= trips[num][0];
                    it.remove();
                }
            }
            peopleNum += trips[i][0];
            if (peopleNum > capacity)
                return false;
            list.add(i);
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{8, 2, 3}, {4, 1, 3}, {1, 3, 6}, {8, 4, 6}, {4, 4, 8}};
        carPooling(arr, 12);
    }
}
