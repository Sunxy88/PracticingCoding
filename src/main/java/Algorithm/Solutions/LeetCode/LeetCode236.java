package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode236 {

    private TreeNode res = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return res;
    }

    private boolean dfs(TreeNode cur, TreeNode p, TreeNode q) {
        if (cur == null) return false;
        boolean left = dfs(cur.left, p, q);
        boolean right = dfs(cur.right, p, q);
        if ((left && right) || ((cur.val == p.val || cur.val == q.val) && (left || right))) {
            res = cur;
        }
        return left || right || cur.val == p.val || cur.val == q.val;
    }
}
