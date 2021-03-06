package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode131 {

    private boolean[][] isPalindrome;
    private List<List<String>> res = new ArrayList<>();
    private List<String> ans = new ArrayList<>();
    private int n;

    public List<List<String>> partition(String s) {
        n = s.length();
        isPalindrome = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(isPalindrome[i], true);
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                isPalindrome[i][j] = (s.charAt(i) == s.charAt(j)) && isPalindrome[i + 1][j - 1];
            }
        }

        dfs(s, 0);
        return res;
    }

    private void dfs(String s, int i) {
        if (i == n) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for (int j = i; j < n; j++) {
            if (isPalindrome[i][j]) {
                ans.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }

}
