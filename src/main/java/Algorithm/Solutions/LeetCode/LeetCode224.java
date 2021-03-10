package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode224 {

    public int calculate(String s) {
        Deque<Integer> ops = new LinkedList<>();
        ops.push(1);
        int sign = 1;

        int res = 0;
        int len = s.length();
        int i = 0;

        while (i < len) {
            char o = s.charAt(i);
            if (o ==' ') {
                i++;
            } else if (o == '+') {
                sign = ops.peek();
                i++;
            } else if (o == '-') {
                sign = -ops.peek();
                i++;
            } else if (o == '(') {
                ops.push(sign);
                i++;
            } else if (o ==')') {
                ops.pop();
                i++;
            } else {
                long num = 0;
                while (i < len && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                res += sign * num;
            }
        }

        return res;
    }

}
