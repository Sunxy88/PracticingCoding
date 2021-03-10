package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode114 {
    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left != null) {
                TreeNode previousNode = root.left;
                while (previousNode.right != null) {
                    previousNode = previousNode.right;
                }
                previousNode.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }
}
