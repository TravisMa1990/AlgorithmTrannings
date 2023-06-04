package com.algm.listnode;

public class ListNodeService {

    public String iterater(ListNode head){
        String ret = "";
        while (head != null) {
            if (head.getNext() != null) {
                ret += head.getVal() + "->";
            } else {
                ret += head.getVal();
            }
            head = head.getNext();
        }
        return ret;
    }

    // 1-2-3-4-5
    // 5-4-3-2-1
    public ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        ListNode next;
        while (cur != null) {
            next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode reverse1(ListNode head) {

        if (head == null || head.getNext() == null) {
            return head;
        }

        ListNode ret = reverse1(head.getNext());

        head.getNext().setNext(head);
        head.setNext(null);
        return ret;
    }
}
