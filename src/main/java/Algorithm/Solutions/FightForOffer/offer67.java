package Algorithm.Solutions.FightForOffer;

import java.util.Locale;

public class offer67 {

    public int strToInt(String str) {
        boolean start = false;
        int ans = 0;
        int flag = 1;
        char[] cs = str.toCharArray();

        for (char c : cs) {
            if (!start) {
                if (c == '+') {
                    start = true;
                } else if (c == '-') {
                    flag = -1;
                    start = true;
                } else if (c == ' ') {
                    continue;
                } else if (c >= '0' && c <= '9') {
                    ans = ans * 10 + c - '0';
                    start = true;
                } else {
                    break;
                }
            } else {
                if (c >= '0' && c <= '9') {
                    if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10) && c > '7') {
                        return flag == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    }
                    ans = ans * 10 + c - '0';
                    start = true;
                } else {
                    break;
                }
            }
        }

        return ans * flag;
    }

}
