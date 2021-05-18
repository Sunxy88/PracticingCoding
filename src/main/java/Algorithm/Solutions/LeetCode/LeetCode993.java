package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode993 {

    private TreeNode parentX = null, parentY = null;
    private int depthX = 0, depthY = 0;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, x, y, 0);
        return depthY == depthX && parentY != parentX;
    }

    private void dfs(TreeNode node, int x, int y, int depth) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            if (node.left.val == x) {
                parentX = node;
                depthX = depth + 1;
            }
            if (node.left.val == y) {
                parentY = node;
                depthY = depth + 1;
            }
        }
        if (node.right != null) {
            if (node.right.val == x) {
                parentX = node;
                depthX = depth + 1;
            }
            if (node.right.val == y) {
                parentY = node;
                depthY = depth + 1;
            }
        }
        dfs(node.left, x, y, depth + 1);
        dfs(node.right, x, y, depth + 1);
    }

}
