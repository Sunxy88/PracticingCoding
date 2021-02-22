package Algorithm.Solutions.LeetCode;

public class LeetCode1052 {

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        if (customers == null || grumpy == null || customers.length == 0 || grumpy.length == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < customers.length; i++) {
            total += (1 - grumpy[i]) * customers[i];
        }

        int increase = 0;
        for (int i = 0; i < X; i++) {
            increase += customers[i] * grumpy[i];
        }

        int maxIncrease = increase;
        for (int i = X; i < customers.length; i++) {
            increase = increase - customers[i - X] * grumpy[i - X] + customers[i] * grumpy[i];
            maxIncrease = Math.max(increase, maxIncrease);
        }

        return total + maxIncrease;
    }

}
