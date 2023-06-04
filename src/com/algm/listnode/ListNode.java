package com.algm.listnode;

public class ListNode {
    String val;
    ListNode next;

    public ListNode(String val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
