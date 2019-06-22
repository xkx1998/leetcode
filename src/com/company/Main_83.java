package com.company;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Main_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        while (head != null) {
            set.add(head.val);
            head = head.next;
        }

        Iterator<Integer> it = set.iterator();
        ListNode head3 = new ListNode(1);
        if (it.hasNext()) {
            ListNode head2 = new ListNode(it.next());
            ListNode head4 = head2;
            head2.next = null;
            while (it.hasNext()) {
                ListNode node = new ListNode(it.next());
                node.next = null;
                head2.next = node;
                head2 = head2.next;
            }
            head3 = head4;
        }

        return  head3;
    }
}
