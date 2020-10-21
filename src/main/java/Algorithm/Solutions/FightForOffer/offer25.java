package Algorithm.Solutions.FightForOffer;

import Algorithm.UsefulDataStructure.ListNode;

public class offer25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode ptr = dummyHead;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ptr.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                ptr.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            ptr = ptr.next;
        }

        while (l1 != null) {
            ptr.next = new ListNode(l1.val);
            l1 = l1.next;
            ptr = ptr.next;
        }

        while (l2 != null) {
            ptr.next = new ListNode(l2.val);
            l2 = l2.next;
            ptr = ptr.next;
        }

        return dummyHead.next;
    }

}
