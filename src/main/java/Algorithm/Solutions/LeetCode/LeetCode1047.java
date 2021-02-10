package Algorithm.Solutions.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode1047 {

    public String removeDuplicates(String S) {
        int len;
        if (S == null || (len = S.length()) == 0) {
            return null;
        }

        char[] cs = S.toCharArray();
        Deque<Character> stack = new LinkedList<>();
        int ptr = 0;
        while (ptr < len) {
            if (stack.isEmpty()) {
                stack.addLast(cs[ptr]);
            } else {
                while (ptr < len && !stack.isEmpty() && cs[ptr] == stack.peekLast()) {
                    stack.pollLast();
                    ptr++;
                }
                if (ptr < len) {
                    stack.addLast(cs[ptr]);
                }
            }
            ptr++;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pollFirst());
        }
        return sb.toString();
    }

}
