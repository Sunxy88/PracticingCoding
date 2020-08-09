package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode110 {
    private boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        dfs(root);
        return flag;
    }

    private int dfs(TreeNode node) {
        if (node == null)
            return 0;
        int l = dfs(node.left) + 1;
        int r = dfs(node.right) + 1;
        if (Math.abs(l - r) > 1)
            flag = false;
        return Math.max(l, r);
    }
}
