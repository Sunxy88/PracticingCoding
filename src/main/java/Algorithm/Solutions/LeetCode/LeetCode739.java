package Algorithm.Solutions.LeetCode;

import java.util.Stack;

public class LeetCode739 {
    public int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0)
            return new int[0];

        Stack<Integer> monoStack = new Stack<>();
        int[] res = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            while (!monoStack.isEmpty() && T[i] > T[monoStack.peek()]) {
                int ptr = monoStack.pop();
                res[ptr] = i - ptr;
            }
            monoStack.push(i);
        }

        while (!monoStack.isEmpty()) {
            res[monoStack.pop()] = 0;
        }

        return res;
    }
}
