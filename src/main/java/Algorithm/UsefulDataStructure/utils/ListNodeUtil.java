package Algorithm.UsefulDataStructure.utils;

import Algorithm.UsefulDataStructure.ListNode;

import java.util.List;

public class ListNodeUtil {

    public static ListNode generateListNode(List<Integer> datas) {
        ListNode dummyHead = new ListNode();
        ListNode ptr = dummyHead;

        for (Integer val : datas) {
            ptr.next = new ListNode(val);
            ptr = ptr.next;
        }

        return dummyHead.next;
    }

    public static String toStringHelper(ListNode head) {
        StringBuilder sb = new StringBuilder();
        if (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        while (head != null) {
            sb.append(" -> " + head);
            head = head.next;
        }

        return sb.toString();
    }
}
