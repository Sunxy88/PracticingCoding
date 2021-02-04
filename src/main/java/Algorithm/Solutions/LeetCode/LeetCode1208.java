package Algorithm.Solutions.LeetCode;

public class LeetCode1208 {

    public int equalSubstring(String s, String t, int maxCost) {
        int len;
        if (s == null || (len = s.length()) == 0) {
            return 0;
        }

        int[] costAry = new int[len];
        for (int i = 0; i < len; i++) {
            costAry[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int l = -1, r = 0;
        int curCost = 0;
        int res = 0;
        while (r < len) {
            if (curCost + costAry[r] <= maxCost) {
                curCost += costAry[r];
                res = Math.max(res, r - l);
                r++;
            } else {
                l++;
                curCost -= costAry[l];
            }
        }

        return res;
    }

}
