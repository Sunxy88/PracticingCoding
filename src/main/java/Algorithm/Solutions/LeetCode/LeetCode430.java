package Algorithm.Solutions.LeetCode;

public class LeetCode430 {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }

        return recursive(head, null)[0];
    }

    private Node[] recursive(Node head, Node tail) {
        Node[] res = new Node[2];
        if (head == null) {
            return res;
        }
        Node prev = null;
        Node ptr = head;
        Node next = null;
        while (ptr != null) {
            if (ptr.child != null) {
                next = ptr.next;
                Node[] result = recursive(ptr.child, next);
                ptr.next = result[0];
                if (result[0] != null) {
                    result[0].prev = ptr;
                }
                result[1].next = next;
                if (next != null) {
                    next.prev = result[1];
                }
                prev = result[1];
                ptr.child = null;
            } else {
                prev = ptr;
            }
            ptr = ptr.next;
        }
        prev.next = tail;
        res[0] = head;
        res[1] = prev;
        return res;
    }
}

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}