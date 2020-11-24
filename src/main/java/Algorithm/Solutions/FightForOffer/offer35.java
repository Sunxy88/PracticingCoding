package Algorithm.Solutions.FightForOffer;


import java.util.HashMap;
import java.util.Map;

public class offer35 {

    public Node copyRandomList(Node head) {
//        Solution 1
//        if (head == null) {
//            return null;
//        }
//
//        Node dummyHead = new Node(0);
//        Node ptr1 = head, ptr2 = dummyHead;
//        Map<Node, Node> nodeMap = new HashMap<>();
//
//        while (ptr1 != null) {
//            ptr2.next = new Node(ptr1.val);
//            nodeMap.put(ptr1, ptr2.next);
//            ptr2 = ptr2.next;
//            ptr1 = ptr1.next;
//        }
//
//        ptr1 = head;
//        ptr2 = dummyHead.next;
//        while (ptr1 != null) {
//            if (ptr1.random == null) {
//                ptr2.random = null;
//            } else {
//                ptr2.random = nodeMap.get(ptr1.random);
//            }
//            ptr1 = ptr1.next;
//            ptr2 = ptr2.next;
//        }
//
//        return dummyHead.next;

//        Solution 2
        if (head == null) {
            return null;
        }

        Node ptr = head;

        while (ptr != null) {
            Node tmp = new Node(ptr.val);
            tmp.next = ptr.next;
            ptr.next = tmp;
            ptr = tmp.next;
        }

        ptr = head;

        while (ptr != null) {
            ptr.next.random = ptr.random == null ? null : ptr.random.next;
            ptr = ptr.next.next;
        }

        Node nhead = head.next;
        ptr = head;
        Node ptr2 = nhead;

        while (ptr2.next != null) {
            ptr.next = ptr.next.next;
            ptr2.next = ptr2.next.next;
            ptr = ptr.next;
            ptr2 = ptr2.next;
        }
        ptr.next = null;

        return nhead;
    }

}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}