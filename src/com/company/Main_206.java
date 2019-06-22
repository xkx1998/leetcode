package com.company;

public class Main_206 {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy.next;
        ListNode pCur = prev.next;
        while(pCur != null) {
            prev.next = pCur.next;
            pCur.next = dummy.next;
            dummy.next = pCur;
            pCur = prev.next;
        }
        return dummy.next;
    }
}
