package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode124 {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        postOrder(root);
        return max;
    }

    public int postOrder(TreeNode node) {
        if (node == null)
            return 0;
        int left = postOrder(node.left);
        int right = postOrder(node.right);

        if (left < 0) left = 0;
        if (right < 0) right = 0;

        int path = left + right + node.val;
        max = Math.max(max, path);

        return node.val + Math.max(left, right);
    }
}
