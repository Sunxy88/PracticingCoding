package Algorithm.Solutions.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode227 {

    public int calculate(String s) {
        int len;

        if (s == null || (len = s.length()) == 0) {
            return 0;
        }

        Deque<Integer> oprands = new LinkedList<>();
        int num = 0;
        char preSign = '+';

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            }
            if ((!Character.isDigit(c) && c != ' ' )|| i == len - 1){
                if (preSign == '+') {
                    oprands.push(num);
                } else if (preSign == '-') {
                    oprands.push(-num);
                } else if (preSign == '*') {
                    oprands.push(oprands.pop() * num);
                } else if (preSign == '/') {
                    oprands.push(oprands.pop() / num);
                }
                preSign = c;
                num = 0;
            }
        }

        int ans = 0;
        while (!oprands.isEmpty()) {
            ans += oprands.pop();
        }

        return ans;
    }

}
