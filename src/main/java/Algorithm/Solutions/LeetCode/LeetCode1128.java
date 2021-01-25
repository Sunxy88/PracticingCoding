package Algorithm.Solutions.LeetCode;


public class LeetCode1128 {

    public int numEquivDominoPairs(int[][] dominoes) {
        if (dominoes == null || dominoes.length == 0) {
            return 0;
        }

        int[] counter = new int[100];
        int ans = 0;

        for (int[] domino : dominoes) {
            int val = domino[0] < domino[1] ? domino[1] * 10 + domino[0] : domino[0] * 10 + domino[1];
            ans += counter[val];
            counter[val]++;
        }

        return ans;
    }

}
