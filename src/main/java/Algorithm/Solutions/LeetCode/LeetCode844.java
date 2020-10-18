package Algorithm.Solutions.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode844 {

    public boolean backspaceCompare(String S, String T) {
        Deque<Character> s = new ArrayDeque<>();
        Deque<Character> t = new ArrayDeque<>();

        for (char c : S.toCharArray()) {
            if (c == '#') {
                if (!s.isEmpty()) {
                    s.pollLast();
                }
            } else {
                s.addLast(c);
            }
        }

        for (char c : T.toCharArray()) {
            if (c == '#') {
                if (!t.isEmpty()) {
                    t.pollLast();
                }
            } else {
                t.addLast(c);
            }
        }

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (!s.isEmpty()) {
            sb1.append(s.pollFirst());
        }

        while (!t.isEmpty()) {
            sb2.append(t.pollFirst());
        }

        return sb1.toString().equals(sb2.toString());
    }

}
