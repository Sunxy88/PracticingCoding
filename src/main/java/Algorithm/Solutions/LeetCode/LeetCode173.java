package Algorithm.Solutions.LeetCode;

import Algorithm.UsefulDataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode173 {
}

class BSTIterator {

    private List<Integer> list;
    private int ptr;

    public BSTIterator(TreeNode root) {
        this.list = new ArrayList<>();
        inOrder(root);
        this.ptr = 0;
    }

    public int next() {
        return list.get(ptr++);
    }

    public boolean hasNext() {
        return ptr < list.size();
    }

    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        list.add(node.val);
        inOrder(node.right);
    }
}