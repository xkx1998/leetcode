package com.company;

public class Main_1006 {
    public static int clumsy(int N) {
        int[] num1 = new int[N];
        int[] num2 = new int[N];
        int num1_len = 0;
        int num2_len = 0;

        int sum1 = 0;
        int sum2 = 0;
        for (int i = N; i > 0; i = i - 4) {
            num1[num1_len++] = i;
        }
        for (int i = N - 3; i > 0; i = i - 4) {
            num2[num2_len++] = i;
        }

        for (int i = 0; i < num1_len; i++) {
            int sum = 1;
            if (i == 0) {
                if (num1[i] - 1 > 0) {
                    sum = num1[i] * (num1[i] - 1);
                    if (num1[i] - 2 > 0) {
                        sum /= num1[i] - 2;
                        sum1 += sum;
                        continue;
                    } else {
                        sum1 += sum;
                    }
                } else {
                    sum = num1[i];
                    sum1 += sum;
                    break;
                }
            } else {
                if (num1[i] - 1 > 0) {
                    sum = num1[i] * (num1[i] - 1);
                    if (num1[i] - 2 > 0) {
                        sum /= num1[i] - 2;
                        sum1 -= sum;
                        continue;
                    } else {
                        sum1 -= sum;
                    }
                } else {
                    sum = num1[i];
                    sum1 -= sum;
                    break;
                }
            }

        }

        for (int i = 0; i < num2_len; i++) {
            sum2 += num2[i];
        }
        return sum1 + sum2;
    }

    public static void main(String[] args) {
        System.out.println(clumsy(4));
    }
}
