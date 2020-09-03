package Algorithm.Solutions.FightForOffer;

import Algorithm.UsefulDataStructure.ListNode;

public class offer06 {

    public int[] reversePrint(ListNode head) {
        if (head == null)
            return new int[0];

        ListNode root = null;
        ListNode cur = head;
        int cnt = 0;

        while (cur != null) {
            ListNode tmp = new ListNode(cur.val);
            tmp.next = root;
            root = tmp;
            cur = cur.next;
            cnt++;
        }

        cur = root;
        int[] res = new int[cnt];
        int i = 0;

        while (cur != null) {
            res[i++] = cur.val;
            cur = cur.next;
        }

        return res;
    }
}
