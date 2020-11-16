package Algorithm.Solutions.FightForOffer;

import java.util.Deque;
import java.util.LinkedList;

public class offer31 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new LinkedList<>();
        int len = pushed.length;
        int popedPtr = 0;
        for (int j : pushed) {
            stack.offerLast(j);
            while (!stack.isEmpty() && popped[popedPtr] == stack.peekLast()) {
                popedPtr++;
                stack.pollLast();
            }
        }

        return stack.isEmpty();
    }

}
