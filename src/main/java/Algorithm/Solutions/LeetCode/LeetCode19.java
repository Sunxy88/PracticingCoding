package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        ListNode fast = head, slow = head;
        int cnt = 0;

        while (fast != null) {
            fast = fast.next;
            if (cnt <= n) {
                cnt++;
            } else {
                slow = slow.next;
            }
        }

        if (cnt > n && slow.next != null) {
            slow.next = slow.next.next;
        } else if (cnt == n) {
            return head.next;
        }

        return head;
    }

}
