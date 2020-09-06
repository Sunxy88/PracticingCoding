package Algorithm.Solutions.FightForOffer;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class offer07 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
            return null;

        Map<Integer, Integer> indexMap = new HashMap<>();
        int length = preorder.length;
        for (int i = 0; i < length; i++) {
            indexMap.put(inorder[i], i);
        }

        return buildTree(preorder, 0, length - 1, inorder, 0, length - 1, indexMap);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd,
                               int[] inorder, int inStart, int inEnd,
                               Map<Integer, Integer> indexMap) {
        if (preStart > preEnd) return null;
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);
        if (preStart != preEnd) {
            int inorderMid = indexMap.get(rootVal);
            int leftNodes = inorderMid - inStart, rightNodes = inEnd - inorderMid;
            root.left = buildTree(preorder, preStart + 1, preStart + leftNodes,
                    inorder, inStart, inorderMid - 1, indexMap);
            root.right = buildTree(preorder, preEnd - rightNodes + 1, preEnd,
                    inorder, inorderMid + 1, inEnd, indexMap);
        }
        return root;
    }
}
