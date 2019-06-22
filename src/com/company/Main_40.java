package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. Combination Sum II
 * 回溯算法
 */
public class Main_40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> clist = new ArrayList<>();
        Arrays.sort(candidates);
        list.add(clist);
        backtrace(candidates, target, list, clist, 0);
        return list;
    }

    public boolean backtrace(int[] candidates, int remain, List<List<Integer>> list, List<Integer> clist, int start) {
        if (remain < 0) return false;
        if (remain == 0) {
            if (!list.contains(clist)){
                list.add(new ArrayList<>(clist));
            }
            return false;
        } else {
            for (int i = start; i < candidates.length; i++) {
                boolean flag;
                clist.add(candidates[i]);
                flag = backtrace(candidates, remain - candidates[i], list, clist, i + 1);
                clist.remove(clist.size() - 1);
                if (!flag) {
                    break;
                }
            }
            return true;
        }

    }
}
