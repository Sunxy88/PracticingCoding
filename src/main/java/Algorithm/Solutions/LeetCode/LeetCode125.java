package Algorithm.Solutions.LeetCode;

public class LeetCode125 {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0)
            return true;
        char[] cs = s.toLowerCase().toCharArray();
        int n = cs.length;
        StringBuilder left2right = new StringBuilder();
        StringBuilder right2left = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (Character.isLetterOrDigit(cs[i]))
                left2right.append(cs[i]);
            if (Character.isLetterOrDigit(cs[n - i - 1]))
                right2left.append(cs[n - i - 1]);
        }
        return left2right.toString().equals(right2left.toString());
    }
}
