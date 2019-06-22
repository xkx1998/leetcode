package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main_1046 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new LinkedList<>();
        for(int i = 0 ;i < stones.length;i++) {
            list.add(stones[i]);
        }
        Collections.sort(list);
        while(list.size() > 1) {
            int x = list.remove(list.size() -2);
            int y = list.remove(list.size() - 1);
            if(x == y) {
                continue;
            }else {
                list.add(y - x);
                Collections.sort(list);
            }
        }
        if(list.size() == 1)
            return list.get(0);
        return 0;
    }
}
