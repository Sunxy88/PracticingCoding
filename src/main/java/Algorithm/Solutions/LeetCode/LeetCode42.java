package Algorithm.Solutions.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode42 {
    // 单调栈的应用
    public int trap(int[] height) {
        if (height == null || height.length == 0)
            return 0;
        int ans = 0;
        Deque<Integer> walls = new ArrayDeque<>();
        for (int i = 0; i < height.length; i++) {
            while (!walls.isEmpty() && height[i] > height[walls.peek()]) {
                int cur = walls.pop();
                while (!walls.isEmpty() && height[cur] == height[walls.peek()])
                    walls.pop();
                if (!walls.isEmpty()) {
                    int left = walls.peek();
                    ans += (Math.min(height[i], height[left]) - height[cur]) * (i - left - 1);
                }
            }
            walls.push(i);
        }
        return ans;
    }
}
