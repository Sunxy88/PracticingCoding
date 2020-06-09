package Algorithm.Solutions.LeetCode;

public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (x == 0)
            return true;
        int t = 0;
        int target = x;
        while (x > 0) {
            t = t * 10 + x % 10;
            x /= 10;
        }
        return target == t;
    }
}
