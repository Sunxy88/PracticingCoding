package Algorithm.Solutions.LeetCode;

public class LeetCode313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if (n <= 0 || primes == null || primes.length == 0)
            return 1;
        int[] index = new int[primes.length];
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            int minNext = 0x7fffffff;
            for (int j = 0; j < primes.length; j++) {
                if (minNext > res[index[j]] * primes[j])
                    minNext = res[index[j]] * primes[j];
            }
            res[i] = minNext;
            for (int j = 0; j < primes.length; j++) {
                if (minNext == res[index[j]] * primes[j])
                    index[j]++;
            }
        }
        return res[n - 1];
    }
}
