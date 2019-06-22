package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main_1090 {
    public static int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> clist = new ArrayList<>();

        int[] nums = new int[labels.length];
        for (int i = 0; i < labels.length; i++) {
            nums[i] = i;
        }
        for (int i = 1; i <= num_wanted; i++) {
            clist.clear();
            DFS(list, clist, 0, nums, i, use_limit, labels);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            clist = list.get(i);
            int sum = 0;
            for (int index : clist) {
                sum += values[index];
            }

            if (max < sum) {
                System.out.println(clist);
                max = sum;
            }
        }
        return max;
    }

    public static void DFS(List<List<Integer>> list, List<Integer> clist, int start, int[] nums, int number, int use_limit, int[] lables) {
        if (clist.size() == number) {
            int[] count = new int[20000];
            int index = 0;
            boolean b = true;

            for (int i = 0; i < number; i++) {
                int num = lables[clist.get(i)];
                count[num]++;
                index++;
            }

            for (int i = 0; i < number; i++) {
                int num = lables[clist.get(i)];
                if (count[num] <= use_limit)
                    continue;
                else {
                    b = false;
                    break;
                }
            }
            if (b) {
                list.add(new ArrayList<>(clist));
            }

            return;
        }

        for (int i = start; i < nums.length; i++) {
            clist.add(nums[i]);
            DFS(list, clist, i + 1, nums, number, use_limit, lables);
            clist.remove(clist.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] values = {50,85,4,18,29,72,65,1,54,22,31,12,85};
        int[] lables = {5,5,1,0,2,0,5,2,5,2,5,5,4};
        int a = 5;
        int b = 2;
        System.out.println(largestValsFromLabels(values, lables, a, b));
    }


}
