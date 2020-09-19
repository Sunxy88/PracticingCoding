package Algorithm.Solutions.LeetCodeCompet;

public class CompeteQuestion5503 {

    public int sumOddLengthSubarrays(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int sum = 0;
        for (int len = 1; len <= arr.length; len += 2) {
            for (int i = 0; i + len <= arr.length; i++) {
                for (int j = i; j < i + len; j++) {
                    sum += arr[j];
                }
            }
        }

        return sum;
    }
}
