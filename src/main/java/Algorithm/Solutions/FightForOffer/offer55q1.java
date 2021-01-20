package Algorithm.Solutions.FightForOffer;

import Algorithm.UsefulDataStructure.TreeNode;

public class offer55q1 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }

}
