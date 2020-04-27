package Algorithm.Solutions.LeetCode;

import java.util.List;

public class LeetCode139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        return backTrack(s, wordDict, new Boolean[s.length()], 0);
    }

    private boolean backTrack(String s, List<String> dict, Boolean[] memo, int start) {
        if (start >= s.length())
            return true;

        if (memo[start] != null)
            return memo[start];

        for (int i = start + 1; i <= s.length(); i++) {
            if (dict.contains(s.substring(start, i)) && backTrack(s, dict, memo, i)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }
}
/*
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return word_Break(s, new HashSet(wordDict), 0, new Boolean[s.length()]);
    }
    public boolean word_Break(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length()) {
            return true;
        }
        if (memo[start] != null) {
            return memo[start];
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && word_Break(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }
}
 */
