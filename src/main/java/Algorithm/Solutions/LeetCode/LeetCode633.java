package Algorithm.Solutions.LeetCode;

public class LeetCode633 {

    public boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }

        int a = 0, b = (int) Math.sqrt(c);

        while (a <= b) {
            int sum = a * a + b * b;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                a += 1;
            } else {
                b -= 1;
            }
        }

        return false;
    }

}
