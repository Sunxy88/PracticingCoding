package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.ListNode;
import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        return buildTree(head, null);
    }

    private TreeNode buildTree(ListNode left, ListNode right) {
        if (left == right)
            return null;
        ListNode mid = findMedian(left, right);
        TreeNode midT = new TreeNode(mid.val);
        midT.left = buildTree(left, mid);
        midT.right = buildTree(mid.next, right);
        return midT;
    }

    private ListNode findMedian(ListNode left, ListNode right) {
        ListNode fast = left;
        ListNode slow = left;
        while (fast != right && fast.next != right) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
