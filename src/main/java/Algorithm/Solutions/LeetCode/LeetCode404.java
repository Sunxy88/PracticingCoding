package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode404 {

    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;

        dfs(root, false);

        return sum;
    }

    private void dfs(TreeNode cur, boolean isLeft) {
        if (cur.left == null && cur.right == null) {
            if (isLeft) {
                sum += cur.val;
            }
            return;
        }

        if (cur.left != null)
            dfs(cur.left, true);
        if (cur.right != null)
            dfs(cur.right, false);
    }
}
