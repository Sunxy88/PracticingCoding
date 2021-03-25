package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode ptr = head;
        while (ptr.next != null) {
            if (ptr.next.val == ptr.val) {
                int x = ptr.next.val;
                while (ptr.next != null && ptr.next.val == x) {
                    ptr.next = ptr.next.next;
                }
            } else {
                ptr = ptr.next;
            }
        }

        return head;
    }

}
