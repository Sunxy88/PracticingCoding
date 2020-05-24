package Algorithm.Solutions.LeetCode;

import java.util.Stack;

public class LeetCode150 {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0)
            return 0;
        Stack<Integer> operands = new Stack<>();
        for (String token : tokens) {
            if (token.length() > 1 || (token.charAt(0) >= '0' && token.charAt(0) <= '9')) {
                operands.push(Integer.valueOf(token));
            } else {
                Integer o1 = operands.pop();
                Integer o2 = operands.pop();
                switch (token.charAt(0)) {
                    case '+':
                        operands.push(o2 + o1);
                        break;
                    case '-':
                        operands.push(o2 - o1);
                        break;
                    case '*':
                        operands.push(o2 * o1);
                        break;
                    case '/':
                        operands.push(o2 / o1);
                        break;
                }
            }
        }
        return operands.pop();
    }
}
