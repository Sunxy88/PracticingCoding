package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null)
            return res;

        Queue<TreeNode> nodeQ=  new LinkedList<>();
        nodeQ.offer(root);

        while (!nodeQ.isEmpty()) {
            List<Integer> toAdd = new LinkedList<>();
            TreeNode cur;
            int lenLayer = nodeQ.size();
            for (int i = 0; i < lenLayer; i++) {
                cur = nodeQ.poll();
                if (cur != null) {
                    toAdd.add(cur.val);
                    if (cur.left != null) nodeQ.offer(cur.left);
                    if (cur.right != null) nodeQ.offer(cur.right);
                }
            }
            res.add(toAdd);
        }

        return res;
    }
}
