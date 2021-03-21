package Algorithm.Solutions.CodeInterview;

import Algorithm.UsefulDataStructure.ListNode;
import Algorithm.UsefulDataStructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 3月21日笔试第一题
 * 通过100%
 */
public class Tencent4 {

    private Map<Integer, ListNode> cache = new HashMap<>();


    public ListNode[] solve (TreeNode root, int[] b) {
        int len;
        if (b == null || (len = b.length) == 0) {
            return null;
        }
        ListNode[] res = new ListNode[len];
        if (root == null) {
            return res;
        }
        ListNode head = new ListNode(0);
        dfs(root, head, head);

        for (int i = 0; i < len; i++) {
            res[i] = cache.get(b[i]);
        }

        return res;
    }

    private void dfs(TreeNode node, ListNode listNode, ListNode head) {
        if (node == null) {
            return;
        }
        listNode.next = new ListNode(node.val);
        if (!cache.containsKey(node.val)) {
            cache.put(node.val, copyList(head));
        }
        dfs(node.left, listNode.next, head);
        dfs(node.right, listNode.next, head);
    }

    private ListNode copyList(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode ptr = head.next, ptrN = newHead;

        while (ptr != null) {
            ptrN.next = new ListNode(ptr.val);
            ptr = ptr.next;
            ptrN = ptrN.next;
        }

        return newHead.next;
    }
}
