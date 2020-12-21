package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode316 {
    public String removeDuplicateLetters(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Integer> lastPosition = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            lastPosition.put(s.charAt(i), i);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (!stack.isEmpty() && !stack.contains(c) && stack.peek() > c && lastPosition.get(stack.peek()) > i) {
                stack.pop();
            }
            if (!stack.contains(c)) {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
