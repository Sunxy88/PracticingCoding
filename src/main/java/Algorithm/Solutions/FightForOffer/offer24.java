package Algorithm.Solutions.FightForOffer;

import Algorithm.UsefulDataStructure.ListNode;

public class offer24 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode ptr = head.next;
        head = new ListNode(head.val);
        while (ptr != null) {
            head = newListNode(head, ptr);
            ptr = ptr.next;
        }

        return head;
    }

    private ListNode newListNode(ListNode head, ListNode next) {
        ListNode tmp = new ListNode(next.val);
        tmp.next = head;
        return tmp;
    }

}
