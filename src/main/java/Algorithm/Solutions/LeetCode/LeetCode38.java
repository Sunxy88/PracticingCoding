package Algorithm.Solutions.LeetCode;

public class LeetCode38 {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        char[] s = countAndSay(n - 1).toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int left = 0; left < s.length; ) {
            char num = s[left];
            int cnt = 0;
            int right;
            for (right = left; right < s.length && s[right] == s[left]; right++) {
                cnt += 1;
            }
            left = right;
            sb.append(cnt).append(num);
        }
        return sb.toString();
    }
}
