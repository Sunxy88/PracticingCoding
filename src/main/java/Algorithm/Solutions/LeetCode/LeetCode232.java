package Algorithm.Solutions.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode232 {
}


class MyQueue {

    private Deque<Integer> stk1, stk2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stk1 = new ArrayDeque<>();
        stk2 = new ArrayDeque<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stk1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        transfer();
        return stk2.pop();
    }

    /** Get the front element. */
    public int peek() {
        transfer();
        return stk2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stk1.isEmpty() && stk2.isEmpty();
    }

    private void transfer() {
        if (!empty() && stk2.isEmpty()) {
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }
        }
    }
}
