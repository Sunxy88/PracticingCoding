package Algorithm.Solutions.LeetCode;

public class LeetCode1442 {

    public int countTriplets(int[] arr) {
        int len;
        if (arr == null || (len = arr.length) < 2) {
            return 0;
        }

        int[] prefix = new int[len + 1];
        prefix[0] = arr[0];
        for (int i = 0; i < len; i++) {
            prefix[i + 1] = prefix[i] ^ arr[i];
        }

        int ans = 0;
        for (int i = 0; i< len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (prefix[i] == prefix[j + 1]) {
                    ans += j - i;
                }
            }
        }

        return ans;
    }

}
