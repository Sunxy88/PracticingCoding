package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode143 {

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        Deque<ListNode> nodeQ = new ArrayDeque<>();
        ListNode ptr = head, next = null;
        int total = 0;

        while (ptr != null) {
            nodeQ.addLast(ptr);
            ptr = ptr.next;
            total++;
        }

        if (total % 2 == 0) {
            total = (total - 1) / 2;
        } else {
            total /= 2;
        }

        ptr = head;

        while (total > 0) {
            next = nodeQ.pollLast();
            next.next = ptr.next;
            ptr.next = next;
            ptr = ptr.next.next;
            total--;
        }

        while (ptr.next != next) {
            ptr = ptr.next;
        }
        ptr.next = null;
        return;
    }

}
