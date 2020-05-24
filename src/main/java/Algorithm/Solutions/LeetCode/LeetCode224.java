package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode224 {
    private final Map<String, Integer> priority = new HashMap<>();

    public int calculate(String s) {
        if (s == null || s.length() == 0)
            return 0;
        char[] cs = s.toCharArray();
        priority.put("+", 0);
        priority.put("-", 0);
        priority.put("*", 1);
        priority.put("/", 1);
        priority.put("(", 2);
        Stack<String> tempOperator = new Stack<>();
        Queue<String> operator = new LinkedList<>();

        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == ' ') continue;
            if (cs[i] >= '0' && cs[i] <= '9') {
                String operand = cs[i++] + "";
                while (i < cs.length && cs[i] >= '0' && cs[i] <= '9')
                    operand = operand + cs[i++];
                operator.offer(operand);
                i--;
            } else if (cs[i] == '(') {
                tempOperator.push(cs[i] + "");
            }  else if (cs[i] != ')') {
                String op = cs[i] + "";
                while (!tempOperator.isEmpty() && !tempOperator.peek().equals("(") && priority.get(op) <= priority.get(tempOperator.peek())) {
                    operator.offer(tempOperator.pop());
                }
                tempOperator.push(op);
            } else if (cs[i] == ')') {
                while (!tempOperator.isEmpty() && !tempOperator.peek().equals("(")) {
                    operator.offer(tempOperator.pop());
                }
                tempOperator.pop();
            }
        }
        while (!tempOperator.isEmpty()) {
            operator.offer(tempOperator.pop());
        }
        String[] tokens = new String[operator.size()];
        int i = 0;
        while (!operator.isEmpty()) {
            tokens[i++] = operator.poll();
        }
        return evalRPN(tokens);
    }

    private int evalRPN(String[] tokens) {
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
