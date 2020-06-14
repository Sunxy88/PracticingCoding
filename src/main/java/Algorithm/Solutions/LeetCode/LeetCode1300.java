package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode1300 {
    public int findBestValue(int[] arr, int target) {
        if (arr == null || arr.length == 0)
            return 0;
        Arrays.sort(arr);
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }
        int r = arr[n - 1];
        int ans = 0, diff = target;
        for (int i = 1; i <= r; i++) {
            int index = Arrays.binarySearch(arr, i);
            if (index < 0) {
                System.out.println(index);
                index = 0;
            }
            int cur = prefix[index] + (n - index) * i;
            if (Math.abs(cur - target) < diff) {
                diff = Math.abs(cur - target);
                ans = i;
            }
        }
        return ans;
    }
}
