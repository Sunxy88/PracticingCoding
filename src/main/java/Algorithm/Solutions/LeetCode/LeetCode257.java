package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;
import Algorithm.UsefulDataStructure.TreeNode;

public class LeetCode257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null)
            return res;
        dfs(res, new StringBuilder(), root);
        return res;
    }

    private void dfs(List<String> res, StringBuilder curPath, TreeNode curNode) {
        int originalLen = curPath.length();
        curPath.append(curNode.val);
        int newLen = curPath.length();
        if (curNode.left == null && curNode.right == null) {
            res.add(curPath.toString());
        }
        if (curNode.left != null) {
            curPath.append("->");
            dfs(res, curPath, curNode.left);
            curPath.delete(curPath.length() - 2, curPath.length());
        }
        if (curNode.right != null) {
            curPath.append("->");
            dfs(res, curPath, curNode.right);
            curPath.delete(curPath.length() - 2, curPath.length());
        }
        curPath.delete(curPath.length() - (newLen - originalLen), curPath.length());
    }
}
