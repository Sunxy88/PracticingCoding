package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode297 {
}


class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            if(node != null) {
                sb.append(node.val + ",");
                queue.addLast(node.left);
                queue.addLast(node.right);
            } else {
                sb.append("null,");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if ("[]".equals(data)) {
            return null;
        }
        String[] vals = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        int i = 1;

        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            if (!"null".equals(vals[i])) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.addLast(node.left);
            }
            i++;
            if (!"null".equals(vals[i])) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.addLast(node.right);
            }
            i++;
        }
        return root;
    }
}

