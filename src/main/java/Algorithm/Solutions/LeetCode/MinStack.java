package Algorithm.Solutions.LeetCode;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> data = new Stack<>();
    private Stack<Integer> mins = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {
    }

    public void push(int x) {
        data.push(x);
        if (mins.isEmpty() || x <= mins.peek())
            mins.push(x);
    }

    public void pop() {
        int t = top();
        if (t == mins.peek())
            mins.pop();
        data.pop();
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}
