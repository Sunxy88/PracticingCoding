package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode82 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(-101);
        dummy.next = head;

        ListNode ptr = dummy;
        while (ptr.next != null && ptr.next.next != null) {
            if (ptr.next.val == ptr.next.next.val) {
                int x = ptr.next.val;
                while (ptr.next != null && ptr.next.val == x) {
                    ptr.next = ptr.next.next;
                }
            } else {
                ptr = ptr.next;
            }
        }

        return dummy.next;
    }

}
