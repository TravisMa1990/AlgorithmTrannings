package com.algm.listnode;

public class ListNodeTestCase {

    public void ListNodeReverse(){
        ListNode head = null;
        for (int i = 5;i>0;i--) {
            head = new ListNode(i+"",head);
        }
        ListNodeService listNodeService = new ListNodeService();
        System.out.println(listNodeService.iterater(head));

//        ListNode ret = listNodeService.reverse(head);
//        System.out.println(listNodeService.iterater(ret));

        ListNode ret = listNodeService.reverse1(head);
        System.out.println(listNodeService.iterater(ret));

    }
}
