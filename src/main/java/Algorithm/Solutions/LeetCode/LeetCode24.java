package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode24 {

    public ListNode swapPairs(ListNode head) {
       ListNode dummyHead = new ListNode();
       dummyHead.next = head;
       ListNode next1, next2;
       ListNode ptr = dummyHead;

       while (ptr.next != null && ptr.next.next != null) {
           next1 = ptr.next;
           next2 = next1.next;
           ptr.next = next2;
           next1.next = next2.next;
           next2.next = next1;
           ptr = next1;
       }
       return dummyHead.next;
    }

}
