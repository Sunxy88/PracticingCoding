package Algorithm.Solutions.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode20 {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            switch (cur) {
                case '(': case '[': case '{':
                    stack.addLast(cur);
                    break;
                case ']':
                    if (stack.isEmpty() || stack.getLast() != '[')
                        return false;
                    else
                        stack.pollLast();
                    break;
                case ')':
                    if (stack.isEmpty() || stack.getLast() != '(')
                        return false;
                    else
                        stack.pollLast();
                    break;
                case '}':
                    if (stack.isEmpty() || stack.getLast() !=  '{')
                        return false;
                    else
                        stack.pollLast();
                    break;
            }
        }
        return stack.isEmpty();
    }
}
