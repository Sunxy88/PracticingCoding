package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null)
            return res;

        Stack<TreeNode> s = new Stack<>();
        TreeNode pre = null;
        while (root != null || !s.isEmpty()) {
            while (root != null) {
                s.push(root);
                root = root.left;
            }
            root = s.peek();
            if (root.right == null || root.right == pre) {
                pre = root;
                res.add(root.val);
                s.pop();
                root = null;
            } else {
                root = root.right;
            }
        }

        return res;
    }
}
