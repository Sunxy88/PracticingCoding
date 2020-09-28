package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LeetCode145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null)
            return res;

        Stack<TreeNode> s = new Stack<>();
        while (root != null || !s.isEmpty()) {
           if (root != null) {
               s.push(root);
               res.addFirst(root.val);
               root = root.right;
           } else {
               root = s.pop();
               root = root.left;
           }
        }

        return res;
    }
}
