package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main_1093 {
    public static double[] sampleStats(int[] count) {
        double sum = 0;
        double max = Integer.MIN_VALUE;
        double[] result = new double[5];
        double maxValue = 0;
        int num = 0;
        int first = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                result[1] = i;
                first++;
                if(first == 1)
                    result[0] = i;

                num += count[i];
                sum += i * count[i];

                if (max < count[i]) {
                    max = count[i];
                    maxValue = i;
                }
            }
        }

        result[2] =  sum / num;
        result[4] = maxValue;

        int state = 0;
        if (num % 2 != 0) {
            state = 1;
        } else {
            state = 2;
        }

        int sum2 = 0;
        for (int i = 0; i < count.length; i++) {
            sum2 += count[i];
            if (sum2 >= num / 2) {
                if (state == 1) {
                    result[3] = i;
                    break;
                } else {
                    if (sum2 - num / 2 >= 1) {
                        result[3] = i;
                        break;
                    } else {

                        double a1 = i;
                        double a2 = i + 1;
                        result[3] = (a1 + a2) / 2;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] count = new int[]{0,1,3,4,0,};
        double[] result = sampleStats(count);
        for (int i = 0; i < result.length; i++) {
            System.out.print(" " + result[i] + " ");
        }

    }
}
