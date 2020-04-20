package Algorithm.Solutions.LeetCode;

import java.util.Stack;

public class LeetCode84 {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0)
            return 0;

        Stack<Integer> monoStack = new Stack<>();
        monoStack.push(-1);
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            while (monoStack.peek() != -1 && heights[i] < heights[monoStack.peek()]) {
                maxArea = Math.max(maxArea, heights[monoStack.pop()] * (i - monoStack.peek() - 1));
            }
            monoStack.push(i);
        }

        while (monoStack.peek() != -1)
            maxArea = Math.max(maxArea, heights[monoStack.pop()] * (heights.length - monoStack.peek() -1));

        return maxArea;
    }
}
