package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Main_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int curry = 0;
        while (l1 != null || l2 != null) {
            int d1 = l1 == null ? 0 : l1.val;
            int d2 = l2 == null ? 0 : l2.val;
            int sum = d1 + d2 + curry;
            curry = sum >= 10 ? 1 : 0;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (curry == 1)
            cur.next = new ListNode(1);

        return dummy.next;
    }
}
