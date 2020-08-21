package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        Deque<TreeNode> treeQ = new LinkedList<>();
        Deque<Integer> hightQ = new LinkedList<>();
        treeQ.addLast(root);
        hightQ.addLast(1);

        while (!treeQ.isEmpty()) {
            TreeNode cur = treeQ.pollFirst();
            Integer high = hightQ.pollFirst();
            if (cur.left == null && cur.right == null) {
                return high;
            }
            if (cur.left != null) {
                treeQ.addLast(cur.left);
                hightQ.addLast(high + 1);
            }
            if (cur.right != null) {
                treeQ.addLast(cur.right);
                hightQ.addLast(high + 1);
            }
        }

        return -1;
    }
}
