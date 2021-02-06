package Algorithm.Solutions.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode32 {

    public int longestValidParentheses(String s) {
        int len;
        if (s == null || (len = s.length()) == 0) {
            return 0;
        }

        int ans = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }

        return ans;
    }

}
