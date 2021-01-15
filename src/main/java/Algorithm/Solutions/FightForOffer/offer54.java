package Algorithm.Solutions.FightForOffer;

import Algorithm.UsefulDataStructure.TreeNode;

public class offer54 {

    int res, k;

    public int kthLargest(TreeNode root, int k) {
        if (root == null) {
            return 0;
        }
        this.k = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return ;
        }

        dfs(node.right);
        if (k == 0) {
            return;
        }

        if (--k == 0) {
            res = node.val;
        }

        dfs(node.left);
    }

}
