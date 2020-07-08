package Algorithm.Solutions.CrackingTheCodeInterview;

import java.util.Arrays;

public class Question1713 {
    public int respace(String[] dictionary, String sentence) {
        int n = sentence.length();
        Trie trie = new Trie();
        for (String s : dictionary) {
            trie.insert(s);
        }
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            Trie curpos = trie;
            for (int j = i; j > 0; j--) {
                int t = sentence.charAt(j - 1) - 'a';
                if (curpos.next[t] == null) {
                    break;
                } else if (curpos.next[t].isEnd) {
                    dp[i] = Math.min(dp[i], dp[j -  1]);
                }
                if (dp[i] == 0)
                    break;
                curpos = curpos.next[t];
            }
        }
        return dp[n];
    }
}

class Trie {
    public Trie[] next;
    public boolean isEnd;

    public Trie() {
        next = new Trie[26];
        isEnd = false;
    }

    public void insert(String s) {
        Trie curtrie = this;

        for (int i = s.length() - 1; i >= 0; i--) {
            int t = s.charAt(i) - 'a';
            if (curtrie.next[t] == null)
                curtrie.next[t] = new Trie();
            curtrie = curtrie.next[t];
        }
        curtrie.isEnd = true;
    }
}
