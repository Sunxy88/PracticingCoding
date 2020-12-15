package Algorithm.Solutions.LeetCode;

public class LeetCode738 {

    public int monotoneIncreasingDigits(int N) {
        char[] str = Integer.toString(N).toCharArray();
        int len = str.length;
        int flag = len;

        for (int i = len - 1; i >= 1; i--) {
            if (str[i - 1] > str[i]) {
                flag = i;
                str[i - 1]--;
            }
        }

        for (int i = flag; i < len; i++) {
            str[i] = '9';
        }

        return Integer.parseInt(new String(str));
    }

}
