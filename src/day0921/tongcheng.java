package day0921;

import java.util.*;

/*
  public class ListNode {
   int val;
   ListNode next = null;
  }

public class Solution {
    */
/**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     *//*

    public ListNode solution (ListNode head, int m, int n) {
        // write code here
        ListNode pre = head;
        ListNode cur = pre.next;
        ListNode tmp = null;
        for(int i =0;i<m;i++) {
            if(cur==null) {
                return head;
            }
            pre=cur;
            cur = cur.next;
        }
        tmp = cur;
        ListNode node1=cur.next;
        ListNode node2=null;
        for(int i =0;i<n-m;i++) {
            if(node1!=null) {
                node2=node1.next;
                node1.next=cur;
                cur=node1;
                if(node2==null) {
                    break;
                }
                node1=node2;
            }
        }
        pre.next= cur;
        tmp.next=node2;
        return head;
    }
    }

}*/

