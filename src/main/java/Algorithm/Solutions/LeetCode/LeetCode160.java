package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA, ptrB = headB;

        while (ptrA != null && ptrB != null) {
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }

        if (ptrA == null) ptrA = headB;
        if (ptrB == null) ptrB = headA;

        while (ptrA != null && ptrB != null) {
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }
        if (ptrA == null) ptrA = headB;
        if (ptrB == null) ptrB = headA;

        while (ptrA != ptrB) {
            if (ptrA == null || ptrB == null)
                return null;
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }
        return ptrA;
    }
}
