package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
            return null;
        return dfs(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode dfs(int[] preorder, int preL, int preR, int[] inorder, int inL, int inR) {
        if (preL > preR || preL >= preorder.length)
            return null;
        if (preL == preR)
            return new TreeNode(preorder[preL]);
        TreeNode root = new TreeNode(preorder[preL]);
        int i;
        for (i = inL; i <= inR; i++) {
            if (preorder[preL] == inorder[i]) {
                break;
            }
        }
        TreeNode left = dfs(preorder, preL + 1, preL + i - 1, inorder, inL, i - 1);
        TreeNode right = dfs(preorder, preL + i, preR, inorder, i + 1, inR);
        root.left = left;
        root.right = right;
        return root;
    }
}
