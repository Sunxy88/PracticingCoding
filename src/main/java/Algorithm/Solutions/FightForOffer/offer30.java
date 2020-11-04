package Algorithm.Solutions.FightForOffer;

import java.util.Stack;

public class offer30 {
}

class MinStack {

    private Stack<Integer> datas;
    private Stack<Integer> mins;

    /** initialize your data structure here. */
    public MinStack() {
        datas = new Stack<>();
        mins = new Stack<>();
    }

    public void push(int x) {
        datas.push(x);
        if (mins.empty() || x < mins.peek()) {
            mins.push(x);
        }
    }

    public void pop() {
        if (datas.peek().equals(mins.peek())) {
            mins.pop();
        }
        datas.pop();
    }

    public int top() {
        return datas.peek();
    }

    public int min() {
        return mins.peek();
    }
}