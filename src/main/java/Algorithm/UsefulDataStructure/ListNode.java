package Algorithm.UsefulDataStructure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int x) {val = x;}
    public ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }

    @Override
    public String toString() {
        return val + "";
    }
}
