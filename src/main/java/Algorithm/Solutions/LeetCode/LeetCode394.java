package Algorithm.Solutions.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode394 {
    public String decodeString(String s) {
        if (s == null || s.length() == 0)
            return "";

        Deque<Integer> times = new LinkedList<>();
        Deque<String> section = new LinkedList<>();
        Deque<String> temp = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        int t = 0;
        char[] source = s.toCharArray();

        for (int i = 0; i < source.length; i++) {
            if (isNumber(source[i])) {
                while (isNumber(source[i])) {
                    t = t * 10 + source[i] - '0';
                    i++;
                }
                times.offerLast(t);
                i--;
                t = 0;
            } else if (source[i] == ']') {
                while (!section.isEmpty() && !section.peekLast().equals("[")) {
                    temp.offerLast(section.pollLast());
                }
                section.pollLast();
                while (!temp.isEmpty()) {
                    sb.append(temp.pollLast());
                }
                int time = times.isEmpty() ? 1 : times.pollLast();
                while (time > 0) {
                    res.append(sb);
                    time--;
                }
                section.offerLast(res.toString());
                sb.delete(0, sb.length());
                res.delete(0, res.length());
            } else {
                section.offerLast(source[i] + "");
            }

        }
        while (!section.isEmpty())
            temp.offerLast(section.pollLast());
        while (!temp.isEmpty())
            res.append(temp.pollLast());

        return res.toString();
    }

    private boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }
}
