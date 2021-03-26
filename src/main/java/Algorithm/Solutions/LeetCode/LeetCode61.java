package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode61 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int len = 1;
        ListNode ptr = head;

        while (ptr.next != null) {
            ptr = ptr.next;
            len++;
        }
        ptr.next = head;
        k %= len;

        ListNode ptr2 = head;
        for (int i = 0; i < len - k; i++) {
            ptr2 = ptr2.next;
        }

        ptr = ptr2;
        for (int i = 0; i < len - 1; i++) {
            ptr = ptr.next;
        }
        ptr.next = null;

        return ptr2;
    }

}
