package Algorithm.Solutions.LeetCode;

import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null)
            return res;

        Stack<TreeNode> s = new Stack<>();
        TreeNode t;
        s.push(root);

        while (!s.isEmpty()) {
            t = s.pop();
            res.add(t.val);
            if (t.right != null)
                s.push(t.right);
            if (t.left != null)
                s.push(t.left);
        }

        return res;
    }
}
