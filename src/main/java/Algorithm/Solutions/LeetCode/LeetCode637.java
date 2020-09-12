package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.*;

public class LeetCode637 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Deque<TreeNode> q = new LinkedList<>();
        int thisLay = 0, nextLay = 0, totalThisLay = 0;
        double sum = 0;
        q.addFirst(root);
        nextLay++;
        TreeNode cur;

        while (!q.isEmpty()) {
            if (thisLay == 0) {
                totalThisLay = thisLay = nextLay;
                nextLay = 0;
            }
            cur = q.pollLast();
            sum += cur.val;
            thisLay--;
            if (thisLay == 0) {
                res.add(sum / totalThisLay);
                sum = 0;
            }
            if (cur.left != null) {
                q.addFirst(cur.left);
                nextLay++;
            }
            if (cur.right != null) {
                q.addFirst(cur.right);
                nextLay++;
            }
        }

        return res;
    }
}
