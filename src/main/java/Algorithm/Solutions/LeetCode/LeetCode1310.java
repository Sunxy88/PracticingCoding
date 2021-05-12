package Algorithm.Solutions.LeetCode;

public class LeetCode1310 {

    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xorCache = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            xorCache[i + 1] = arr[i] ^ xorCache[i];
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = xorCache[queries[i][0]] ^ xorCache[queries[i][1] + 1];
        }

        return ans;
    }

}
