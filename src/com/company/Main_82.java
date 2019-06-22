package com.company;

import java.util.*;

public class Main_82 {
    public static ListNode deleteDuplicates(ListNode head) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        ListNode temp = head;
        if (head == null) return head;
        while (temp != null) {
            if (!map.containsKey(temp.val))
                map.put(temp.val, 1);
            else {
                map.put(temp.val, map.get(temp.val) + 1);
            }
            temp = temp.next;
        }

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int num = (int) it.next();
            if (map.get(num) == 1) {
                list.add(num);
            }
        }

        if (list.size() == 0) return null;
        ListNode head2 = new ListNode(list.get(0));
        head2.next = null;
        ListNode result = head2;
        for (int i = 1; i < list.size(); i++) {
            ListNode node = new ListNode(list.get(i));
            node.next = null;
            head2.next = node;
            head2 = head2.next;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;
        deleteDuplicates(head);
    }
}
