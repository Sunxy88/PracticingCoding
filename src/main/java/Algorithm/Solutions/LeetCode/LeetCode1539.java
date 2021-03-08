package Algorithm.Solutions.LeetCode;

public class LeetCode1539 {

    public int findKthPositive(int[] arr, int k) {
        int len;

        if (arr == null || (len = arr.length) == 0) {
            return 1;
        }

        int missCount, lastMiss = -1, currentNumber = 1, ptr = 0;
        for (missCount = 0; missCount < k; currentNumber++) {
            if (arr[ptr] == currentNumber) {
                ptr = (ptr + 1 < len) ? ptr + 1 : ptr;
            } else {
                lastMiss = currentNumber;
                missCount++;
            }
        }

        return lastMiss;
    }

}
