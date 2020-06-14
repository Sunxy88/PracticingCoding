package Algorithm.Solutions.LeetCode;

public class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        return divide(strs, 0, strs.length - 1);
    }

    private String divide(String[] strs, int l, int r) {
        if (l >= r)
            return strs[l];
        int m = l + (r - l) / 2;
        String left = divide(strs, l, m);
        String right = divide(strs, m + 1, r);
        StringBuilder sb = new StringBuilder();
        char[] charLeft = left.toCharArray();
        char[] charRight = right.toCharArray();
        for (int i = 0; i < charLeft.length && i < charRight.length; i++) {
            if (charLeft[i] == charRight[i])
                sb.append(charLeft[i]);
            else
                break;
        }
        return sb.toString();
    }
}
