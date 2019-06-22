package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] arr = new int[list.size()];
        for(int i = 0;i < arr.length;i++) {
            arr[i] = list.get(i);
        }
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        ListNode head2 = new ListNode(arr[0]);
        head2.next = null;
        ListNode result = head2;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            node.next = null;
            head2.next = node;
            head2 = head2.next;
        }
        return result;
    }
}
