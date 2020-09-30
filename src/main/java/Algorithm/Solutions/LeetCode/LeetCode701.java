package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        TreeNode cur = root, pre = null;

        while (cur != null) {
            pre = cur;
            if (val > cur.val) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }

        if (val > pre.val) {
            pre.right = new TreeNode(val);
        } else {
            pre.left = new TreeNode(val);
        }

        return root;
    }
}
