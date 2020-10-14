package Algorithm.Solutions.LeetCode;


import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode116 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

//        A solution whose space complexity is O(n) beacause of a queue
//        Deque<Node> q = new ArrayDeque<>();
//        q.addLast(root);
//
//        while (!q.isEmpty()) {
//            int size = q.size();
//
//            for (int i = 0; i < size; i++) {
//                Node cur = q.pollFirst();
//
//                if (i < size - 1) {
//                    cur.next = q.peek();
//                }
//
//                if (cur.left != null) {
//                    q.addLast(cur.left);
//                }
//                if (cur.right != null) {
//                    q.addLast(cur.right);
//                }
//            }
//        }
//
//        return root;

        Node left = root;
        while (left.left != null) {
            Node head = left;
            while (head != null) {
                head.left.next = head.right;
                if (head.next != null) {
                    head.right.next = head.next.left;
                }
                head = head.next;
            }
            left = left.left;
        }
        return root;
    }

}
