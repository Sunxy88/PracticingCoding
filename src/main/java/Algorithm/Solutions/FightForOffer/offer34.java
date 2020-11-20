package Algorithm.Solutions.FightForOffer;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.*;

public class offer34 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> path = new ArrayList<>();
        pathHelper(res, path, 0, root, sum);
        return res;

    }

    private void pathHelper(List<List<Integer>> res, List<Integer> curPath, int curSum, TreeNode curNode, int sum) {
        curPath.add(curNode.val);
        curSum += curNode.val;
        if (curNode.left == null && curNode.right == null) {
            if (curSum == sum) {
                res.add(new ArrayList<>(curPath));
            }
            curPath.remove(curPath.size() - 1);
            return;
        }
        if (curNode.left != null) {
            pathHelper(res, curPath, curSum, curNode.left, sum);
        }
        if (curNode.right != null) {
            pathHelper(res, curPath, curSum, curNode.right, sum);
        }
        curPath.remove(curPath.size() - 1);
    }
}
