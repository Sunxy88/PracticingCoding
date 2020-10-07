package Algorithm.Solutions.LeetCode;

public class LeetCode344 {

    public void reverseString(char[] s) {
        if (s == null) {
            return;
        }

        int l = 0, r = s.length - 1;
        char tmp;

        while (l < r) {
            tmp = s[l];
            s[l++] = s[r];
            s[r--] = tmp;
        }
    }

}
