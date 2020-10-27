package Algorithm.Solutions.LeetCode;

import java.util.*;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.addLast(root);
        TreeNode cur;

        while (!stack.isEmpty()) {
            cur = stack.pollLast();
            res.add(cur.val);
            if (cur.right != null) {
                stack.addLast(cur.right);
            }
            if (cur.left != null) {
                stack.addLast(cur.left);
            }
        }

        return res;
    }
}
