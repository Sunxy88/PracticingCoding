package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>();
        dfs(root1, l1);

        List<Integer> l2 = new ArrayList<>();
        dfs(root2, l2);

        return l1.equals(l2);
    }

    private void dfs(TreeNode node, List<Integer> l) {
        if (node.left == null && node.right == null) {
            l.add(node.val);
        }
        if (node.left != null) {
            dfs(node.left, l);
        }
        if (node.right != null) {
            dfs(node.right, l);
        }
    }

}
