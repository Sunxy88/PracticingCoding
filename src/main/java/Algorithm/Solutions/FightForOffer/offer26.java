package Algorithm.Solutions.FightForOffer;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class offer26 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.addLast(A);
        TreeNode cur;

        while (!stack.isEmpty()) {
            cur = stack.pollLast();
            while (cur != null) {
                if (helper(cur, B)) {
                    return true;
                }
                if (cur.right != null) {
                    stack.addLast(cur.right);
                }
                cur = cur.left;
            }
        }
        return false;
    }

    private boolean helper(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null || A.val != B.val) {
            return false;
        }
        return helper(A.left, B.left) && helper(A.right, B.right);
    }
}
