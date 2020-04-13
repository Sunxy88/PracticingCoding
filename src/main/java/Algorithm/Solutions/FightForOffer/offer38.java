package Algorithm.Solutions.FightForOffer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class offer38 {
    public String[] permutation(String s) {
        if (s == null || s.length() == 0)
            return new String[0];
        List<String> ans = new LinkedList<>();
        boolean[] token = new boolean[s.length()];
        Arrays.fill(token, false);
        char[] carry = s.toCharArray();
        Arrays.sort(carry);
        dfs(new StringBuilder(), carry, token, ans);
        return ans.toArray(new String[ans.size()]);
    }

    private void dfs(StringBuilder sb, char[] s, boolean[] token, List<String> ans) {
        if (sb.length() == s.length) {
            ans.add(sb.toString());
        }

        for (int i = 0; i < s.length; i++) {
            if (token[i]) continue;
            if (i > 0 && s[i] == s[i - 1] && !token[i - 1]) continue;
            sb.append(s[i]);
            token[i] = true;
            dfs(sb, s, token, ans);
            token[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
        return ;
    }
}
