package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode1423 {

    public int maxScore(int[] cardPoints, int k) {
        int len;

        if (cardPoints == null || (len = cardPoints.length) == 0) {
            return 0;
        }

        int windowsize = len - k;
        int sum = 0;

        for (int i = 0; i < windowsize; i++) {
            sum += cardPoints[i];
        }

        int minSum = sum;

        for (int i = windowsize; i < len; i++) {
            sum += cardPoints[i] - cardPoints[i - windowsize];
            minSum = Math.min(minSum, sum);
        }

        return Arrays.stream(cardPoints).sum() - minSum;

    }

}
