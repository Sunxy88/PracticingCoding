package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        List<Integer> helper = new LinkedList<>();
        inOrder(root, helper);
        int m = helper.get(0);
        for (int i = 1; i < helper.size(); i++) {
            if (helper.get(i) <= m)
                return false;
            m = helper.get(i);
        }
        return true;
    }

    private void inOrder(TreeNode root, List<Integer> helper) {
        if (root == null)
            return;
        inOrder(root.left, helper);
        helper.add(root.val);
        inOrder(root.right, helper);
    }
}
