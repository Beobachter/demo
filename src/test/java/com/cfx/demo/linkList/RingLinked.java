package com.cfx.demo.linkList;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RingLinked {

    @Test
    public ListNode detectCycle(ListNode head) {
        ListNode newHeader = new ListNode(0);
        newHeader.next = head;
        while (newHeader.next != null) {

        }
        return null;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

}

