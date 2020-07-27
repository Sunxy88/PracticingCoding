package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
//        if (root == null)
//            return root;
//        invertTree(root.left);
//        invertTree(root.right);
//        TreeNode temp = root.left;
//        root.left = root.right;
//        root.right = temp;
//        return root;
        if (root == null)
            return root;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode cur;
        while (!queue.isEmpty()) {
            cur = queue.poll();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;
            if (cur.left != null) queue.add(cur.left);
            if (cur.right != null) queue.add(cur.right);
        }

        return root;
    }
}
