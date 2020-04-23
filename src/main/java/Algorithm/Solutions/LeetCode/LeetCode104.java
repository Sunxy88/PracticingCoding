package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode104 {
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int depth) {
        if (root == null)
            return depth;

        int depth1 = depth;
        int depth2 = depth;
        depth1 = dfs(root.left, depth + 1);
        depth2 = dfs(root.right, depth + 1);

        return Math.max(depth1, depth2);
    }
}
