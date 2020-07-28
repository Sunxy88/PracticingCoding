package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return dfs(root, sum, 0);
    }

    private boolean dfs(TreeNode curNode, int sum, int curSum) {
        if (sum == (curSum += curNode.val)&& curNode.left == null && curNode.right == null)
            return true;

        boolean flag = false;
        if (curNode.left != null)
            flag = dfs(curNode.left, sum, curSum);
        if (curNode.right != null)
            flag = flag || dfs(curNode.right, sum, curSum);

        return flag;
    }
}
