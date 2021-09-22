package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode725 {

    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode[] ans = new ListNode[k];

        if (head == null) {
            return ans;
        }

        ListNode ptr = head;
        while (ptr != null) {
            len += 1;
            ptr = ptr.next;
        }

        int numberEveryPart = len / k;
        int mod = len % k;
        int index = 0;
        ListNode ptrSlow = head, ptrFast = head;

        while (ptrSlow != null) {
            for (int i = 0; i < numberEveryPart - 1 && ptrFast != null; i += 1) {
                ptrFast = ptrFast.next;
            }
            if (mod > 0 && numberEveryPart > 0 && ptrFast != null) {
                ptrFast = ptrFast.next;
                mod -= 1;
            }
            ans[index++] = ptrSlow;
            if (ptrFast == null) {
                ptrSlow = null;
                continue;
            }
            ptrSlow = ptrFast.next;
            ptrFast.next = null;
            ptrFast = ptrSlow;
        }
        return ans;
    }

}
