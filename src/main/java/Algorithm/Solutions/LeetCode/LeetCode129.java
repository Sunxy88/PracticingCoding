package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode129 {
    public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> treeQ = new LinkedList<>();
        Queue<Integer> sumQ = new LinkedList<>();

        treeQ.offer(root);
        sumQ.offer(0);

        int sum = 0;

        while (!treeQ.isEmpty()) {
            TreeNode curNode = treeQ.poll();
            int curSum = sumQ.poll();
            curSum= curSum * 10 + curNode.val;

            if (curNode.left == null && curNode.right == null)
                sum += curSum;
            if (curNode.left != null) {
                treeQ.offer(curNode.left);
                sumQ.offer(curSum);
            }
            if (curNode.right != null) {
                treeQ.offer(curNode.right);
                sumQ.offer(curSum);
            }
        }

        return sum;

    }
}
