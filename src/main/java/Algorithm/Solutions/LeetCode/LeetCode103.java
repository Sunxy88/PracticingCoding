package Algorithm.Solutions.LeetCode;

import java.util.Deque;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null)
            return res;

        Deque<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();
        boolean left2Right = true;
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> toAdd = new LinkedList<>();
            if (left2Right) {
                left2Right = false;
                while (!q.isEmpty()) {
                    TreeNode t = q.pollFirst();
                    toAdd.add(t.val);
                    if (t.left != null)
                        s.push(t.left);
                    if (t.right != null)
                        s.push(t.right);
                }
                while (!s.isEmpty())
                    q.offer(s.pop());
            } else {
                left2Right = true;
                while (!q.isEmpty()) {
                    TreeNode t = q.pollFirst();
                    toAdd.add(t.val);
                    if (t.right != null)
                        s.push(t.right);
                    if (t.left != null)
                        s.push(t.left);
                }
                while (!s.isEmpty())
                    q.offer(s.pop());
            }
            res.add(toAdd);
        }

        return res;
    }
}
