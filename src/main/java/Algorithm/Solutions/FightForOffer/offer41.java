package Algorithm.Solutions.FightForOffer;

import java.util.PriorityQueue;

public class offer41 {
}

class MedianFinder {

    private PriorityQueue<Integer> minQ;
    private PriorityQueue<Integer> maxQ;

    /** initialize your data structure here. */
    public MedianFinder() {
        minQ = new PriorityQueue<>((o1, o2) -> o1 - o2);
        maxQ = new PriorityQueue<>((o1, o2) -> o2 - o1);
    }

    public void addNum(int num) {
        if (minQ.size() != maxQ.size()) {
            minQ.add(num);
            maxQ.add(minQ.poll());
        } else {
            maxQ.add(num);
            minQ.add(maxQ.poll());
        }
    }

    public double findMedian() {
        if (minQ.size() == maxQ.size()) {
            return (minQ.peek() + 0.0 + maxQ.peek()) / 2.0;
        }
        return minQ.peek();
    }
}
