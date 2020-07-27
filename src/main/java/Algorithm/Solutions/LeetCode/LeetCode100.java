package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.Stack;

public class LeetCode100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> treeP = new Stack<>();
        Stack<TreeNode> treeQ = new Stack<>();

        TreeNode root1 = p, root2 = q;
        treeP.push(root1);
        treeQ.push(root2);

        while (!treeP.isEmpty() && !treeQ.isEmpty()) {
            root1 = treeP.pop();
            root2 = treeQ.pop();

            if (root1 != null && root2 != null && root1.val != root2.val) return false;
            if ((root1 == null && root2 != null) || (root1 != null && root2 == null)) return false;
            if (root1 == null && root2 == null) continue;

            treeP.push(root1.right);
            treeP.push(root1.left);

            treeQ.push(root2.right);
            treeQ.push(root2.left);
        }

        if (!treeP.isEmpty() || !treeQ.isEmpty()) {
            return false;
        }
        return true;
    }
}
