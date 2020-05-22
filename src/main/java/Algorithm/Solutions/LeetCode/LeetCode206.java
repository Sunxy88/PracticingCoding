package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode ptr, t = head.next;
        head.next = null;
        ptr = t;
        while (ptr != null) {
            t = ptr.next;
            ptr.next = head;
            head = ptr;
            ptr = t;
        }
        return head;
    }
}
