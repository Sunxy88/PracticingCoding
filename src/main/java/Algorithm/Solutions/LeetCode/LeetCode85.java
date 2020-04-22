package Algorithm.Solutions.LeetCode;

import java.util.Stack;

public class LeetCode85 {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return 0;

        int maxArea = -1;
        int[] heights = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                heights[j] = matrix[i][j] == '1' ? heights[j] + 1 : 0;
            }
            maxArea = Math.max(maxArea, maxArea(heights));
        }
        return maxArea;
    }

    private int maxArea(int[] heights) {
        Stack<Integer> monoStack = new Stack<>();
        monoStack.push(-1);
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            while (monoStack.peek() != -1 && heights[i] < heights[monoStack.peek()]) {
                maxArea = Math.max(maxArea, heights[monoStack.pop()] * (i - monoStack.peek() - 1));
            }
            monoStack.push(i);
        }

        while (!monoStack.isEmpty()) {
            maxArea = Math.max(maxArea, heights[monoStack.pop()] * (heights.length - monoStack.peek() - 1));
        }

        return maxArea;
    }
}
