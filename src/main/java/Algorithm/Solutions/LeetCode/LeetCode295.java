package Algorithm.Solutions.LeetCode;

import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCode295 {
}

class MedianFinder {
    private PriorityQueue<Integer> leftPart;
    private PriorityQueue<Integer> rightPart;

    /** initialize your data structure here. */
    public MedianFinder() {
        leftPart = new PriorityQueue<>(Collections.reverseOrder());
        rightPart = new PriorityQueue<>();
    }

    public void addNum(int num) {
        leftPart.offer(num);
        rightPart.offer(leftPart.peek());
        leftPart.poll();
        if (leftPart.size() < rightPart.size()) {
            leftPart.offer(rightPart.poll());
        }
    }

    public double findMedian() {
        if ((leftPart.size() + rightPart.size())% 2 == 0)
            return (leftPart.peek() + rightPart.peek()) / 2.0;
        else
            return leftPart.peek();
    }
}
