package Algorithm.Solutions.FightForOffer;

import Algorithm.UsefulDataStructure.TreeNode;

public class offer27 {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        mirrorTree(root.left);
        mirrorTree(root.right);
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
        return root;
    }

}
