package Algorithm.Solutions.FightForOffer;

import Algorithm.UsefulDataStructure.ListNode;

public class offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head, slow = head;
        int cnt = 0;
        while (fast != null) {
            fast = fast.next;
            if (cnt != k) {
                cnt++;
            } else {
                slow = slow.next;
            }
        }
        return slow;
    }
}
