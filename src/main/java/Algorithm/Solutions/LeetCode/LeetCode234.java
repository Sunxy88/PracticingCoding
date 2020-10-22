package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode234 {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        ListNode fast = head, slow = head;

        while (fast.next !=null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalfStart = reverseList(slow.next);
        ListNode p1 = head, p2 = secondHalfStart;
        boolean flag = true;
        while (flag && p2 != null) {
            if (p1.val != p2.val) {
                flag = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        reverseList(secondHalfStart);
        return flag;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTmp;
        }
        return prev;
    }

}
