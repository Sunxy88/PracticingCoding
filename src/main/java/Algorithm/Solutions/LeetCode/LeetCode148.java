package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode148 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head.next.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast =fast.next;
        }
        ListNode t = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(t);
        ListNode h = new ListNode(0);
        ListNode ptr = h;
        while (left != null && right != null) {
            if (left.val < right.val) {
                ptr.next = left;
                left = left.next;
            } else {
                ptr.next = right;
                right = right.next;
            }
            ptr = ptr.next;
        }
        ptr.next = left != null ? left : right;
        return h.next;
    }
}
