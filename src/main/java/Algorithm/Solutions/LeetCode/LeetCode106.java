package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode106 {
    private int[] postorder;
    private int[] inorder;
    private int p_index;
    private Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        this.inorder = inorder;
        this.p_index = postorder.length - 1;
        int idx = 0;
        for (int i : inorder) {
            map.put(i, idx++);
        }
        return helper(0, inorder.length - 1);
    }

    private TreeNode helper(int inL, int inR) {
        if (inL > inR) {
            return null;
        }
        int root_val = postorder[p_index];
        TreeNode root = new TreeNode(root_val);
        int index = map.get(root_val);
        p_index--;
        root.right = helper(index + 1, inR);
        root.left = helper(inL, index - 1);
        return root;
    }

}
