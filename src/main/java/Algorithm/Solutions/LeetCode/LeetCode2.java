package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode root = new ListNode();
        ListNode cur = root;
        int tmp;

        while (l1 != null && l2 != null) {
            tmp = l1.val + l2.val + carry;
            carry = tmp / 10;
            tmp = tmp % 10;
            cur.next = new ListNode(tmp);
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }

        while (l1 != null) {
            tmp = l1.val + carry;
            carry = tmp / 10;
            tmp = tmp % 10;
            cur.next = new ListNode(tmp);
            l1 = l1.next;
            cur = cur.next;
        }

        while (l2 != null) {
            tmp = l2.val + carry;
            carry = tmp / 10;
            tmp = tmp % 10;
            cur.next = new ListNode(tmp);
            l2 = l2.next;
            cur = cur.next;
        }

        if (carry != 0) {
            cur.next = new ListNode(carry);
        }

        return root.next;
    }
}
