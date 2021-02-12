package Algorithm.Solutions.LeetCode;

public class LeetCode70 {

    public int climbStairs(int n) {
        int lastTwo = 0, lastOne = 0, cur = 1;
        for (int i = 1; i <= n; i++) {
            lastTwo = lastOne;
            lastOne = cur;
            cur = lastOne + lastTwo;
        }
        return cur;
    }
}
