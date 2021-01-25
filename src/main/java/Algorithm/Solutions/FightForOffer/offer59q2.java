package Algorithm.Solutions.FightForOffer;

import java.util.ArrayDeque;
import java.util.Deque;

public class offer59q2 {
}


class MaxQueue {

    private Deque<Integer> data;
    private Deque<Integer> maxVals;

    public MaxQueue() {
        this.data = new ArrayDeque<>();
        this.maxVals = new ArrayDeque<>();
    }

    public int max_value() {
        if (maxVals.isEmpty()) {
            return -1;
        }
        return this.maxVals.peekFirst();
    }

    public void push_back(int value) {
        data.offerLast(value);
        while (!maxVals.isEmpty() && value > maxVals.peekLast()) {
            maxVals.pollLast();
        }
        maxVals.offerLast(value);
    }

    public int pop_front() {
        if (data.isEmpty()) {
            return -1;
        }
        int t = data.pollFirst();
        if (t == max_value()) {
            maxVals.pollFirst();
        }
        return t;
    }
}
