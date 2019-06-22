package com.company;


import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 * 回溯算法
 */
public class Main_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> clist = new ArrayList<>();
        list.add(clist);

        for (int i = 1; i <= nums.length; i++) {
            clist.clear();
            DFS(list, clist, 0, nums, i);
        }

        return list;
    }

    public void DFS(List<List<Integer>> list, List<Integer> clist, int start, int[] nums, int number) {
        if (clist.size() == number) {
            list.add(new ArrayList<>(clist));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            clist.add(nums[i]);
            DFS(list, clist, i + 1, nums, number);
            clist.remove(clist.size() - 1);
        }
    }
}
