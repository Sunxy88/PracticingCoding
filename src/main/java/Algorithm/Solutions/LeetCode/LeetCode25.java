package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;

public class LeetCode25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }


        ListNode nextHead, ans = head, nextNewHead;

        nextHead = findKthNode(head, k);
        if (nextHead != head) {
            ans = reverseList(head, nextHead);
            nextNewHead = findKthNode(nextHead, k - 1);
            if (nextNewHead != null && nextNewHead != nextHead) {
                head.next = nextNewHead;
            }
            head = nextHead;
        }

        while (head != null) {
            nextHead = findKthNode(head, k);
            if (nextHead == head) {
                break;
            }
            reverseList(head, nextHead);
            nextNewHead = findKthNode(nextHead, k - 1);
            if (nextNewHead != null && nextNewHead != nextHead) {
                head.next = nextNewHead;
            }
            head = nextHead;
        }

        return ans;
    }

    private ListNode findKthNode(ListNode head, int k) {
        int cnt = 0;
        ListNode ptr = head;
        while (ptr != null && cnt < k) {
            ptr = ptr.next;
            cnt += 1;
        }

        return cnt == k ? ptr : head;
    }

    private ListNode reverseList(ListNode head, ListNode afterTail) {
        ListNode ptr= head, next, prev = afterTail;

        while (ptr != afterTail) {
            next = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = next;
        }

        return prev;
    }
}
