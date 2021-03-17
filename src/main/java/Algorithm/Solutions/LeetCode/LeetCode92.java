package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left >= right) {
            return head;
        }

        ListNode dumyHead = new ListNode();
        dumyHead.next = head;

        int cnt = 0;
        ListNode slow = dumyHead, fast = dumyHead;
        while (cnt <= right - left) {
            fast = fast.next;
            cnt += 1;
        }

        while (cnt < right) {
            slow = slow.next;
            fast = fast.next;
            cnt += 1;
        }

        ListNode ptr = slow.next;
        ListNode ptrTail = fast.next, prev = ptrTail;
        while (ptr != ptrTail) {
            ListNode temp = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = temp;
        }

        slow.next = prev;

        return dumyHead.next;
    }
}
