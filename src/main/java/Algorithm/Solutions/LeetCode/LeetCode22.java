package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode22 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res,0, 0, n, new StringBuilder());
        return res;
    }

    private void backtrack(List<String> res, int open, int close, int n, StringBuilder sb) {
        if (sb.length() == n * 2) {
            res.add(sb.toString());
            return;
        }
        if (open < n) {
            sb.append('(');
            backtrack(res, open + 1, close, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (close < open) {
            sb.append(')');
            backtrack(res, open, close + 1, n, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
