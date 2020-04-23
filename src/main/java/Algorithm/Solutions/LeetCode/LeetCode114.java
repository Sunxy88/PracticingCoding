package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode114 {
    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left == null) {
                root = root.right;
            }
            else {
                TreeNode leftToRight = root.left;
                while (leftToRight.right != null)
                    leftToRight = leftToRight.right;
                leftToRight.right = root.right;
                root.right = root.left;
            }
        }
    }
}
