package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.*;

public class LeetCode113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> nodeQ = new LinkedList<>();
        Queue<Integer> sumQ = new LinkedList<>();
        Queue<List<Integer>> pathQ = new LinkedList<>();

        nodeQ.offer(root);
        sumQ.offer(root.val);
        List<Integer> curPath = new LinkedList<>();
        curPath.add(root.val);
        pathQ.add(curPath);

        TreeNode curNode;
        int curSum;
        while (!nodeQ.isEmpty()) {
            curNode = nodeQ.poll();
            curSum = sumQ.poll();
            curPath = pathQ.poll();
            if (curSum == sum && curNode.left == null && curNode.right == null)
                res.add(curPath);
            if (curNode.left != null) {
                nodeQ.offer(curNode.left);
                sumQ.offer(curSum + curNode.left.val);
                List<Integer> tempPath = new LinkedList<>(curPath);
                tempPath.add(curNode.left.val);
                pathQ.offer(tempPath);
            }
            if (curNode.right != null) {
                nodeQ.offer(curNode.right);
                sumQ.offer(curSum + curNode.right.val);
                List<Integer> tempPath = new LinkedList<>(curPath);
                tempPath.add(curNode.right.val);
                pathQ.offer(tempPath);
            }
        }
        return res;
    }
}
