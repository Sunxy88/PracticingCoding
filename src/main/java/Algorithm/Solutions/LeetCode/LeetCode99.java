package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode99 {
    private TreeNode x, y, pre;

    public void recoverTree(TreeNode root) {
        dfs(root);
        if (x != null && y != null) {
            int tmp = x.val;
            x.val = y.val;
            y.val = tmp;
        }
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        if (pre != null && pre.val > root.val) {
            y = root;
            if (x == null) {
                x = pre;
            }
        }
        pre = root;
        dfs(root.right);
    }
}
