package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode204 {

    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        final int LIMIT = 5000008;
        boolean[] isPrime = new boolean[LIMIT];
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) {
                primeNumbers.add(i);
            }

            for (int pn : primeNumbers) {
                if (pn * i > LIMIT) {
                    break;
                } else {
                    isPrime[pn * i] = true;
                }
                if (pn % i == 0) {
                    break;
                }
            }
        }

        return primeNumbers.size();
    }

}
