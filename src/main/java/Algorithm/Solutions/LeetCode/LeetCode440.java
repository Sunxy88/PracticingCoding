package Algorithm.Solutions.LeetCode;

public class LeetCode440 {

    public int findKthNumber(int n, int k) {

        long i = 1, position = 1;

        while (position < k) {
            long cnt = getCount(i, n);
            if (position + cnt > k) {
                i *= 10;
                position += 1;
            } else if (position + cnt <= k) {
                position += cnt;
                i++;
            }
        }

        return (int)i;
    }

    private long getCount(long i, int n) {
        int cnt = 0;

        for (long lowBound = i, highBound = i + 1; lowBound <= n; lowBound *= 10, highBound *= 10) {
            cnt += Math.min(n + 1, highBound) - lowBound;
        }

        return cnt;
    }
}
