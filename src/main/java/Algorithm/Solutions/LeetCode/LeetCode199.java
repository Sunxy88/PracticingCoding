package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.*;

public class LeetCode199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null)
            return res;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> depthQueue = new LinkedList<>();
        Map<Integer, Integer> depthVal = new HashMap<>();
        nodeQueue.offer(root);
        depthQueue.offer(0);
        int maxDepth = -1;
        while (!nodeQueue.isEmpty()) {
            TreeNode cur = nodeQueue.poll();
            Integer depth = depthQueue.poll();
            maxDepth = Math.max(maxDepth, depth);
            if (cur != null) {
                depthVal.put(depth, cur.val);
                nodeQueue.offer(cur.left);
                nodeQueue.offer(cur.right);
                depthQueue.offer(depth + 1);
                depthQueue.offer(depth + 1);
            }
        }
        for (int i = 0; i < maxDepth; i++)
            res.add(depthVal.get(i));
        return res;
    }
}
