package Algorithm.Solutions.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode202 {
    public boolean isHappy(int n) {
//        Set<Integer> set = new HashSet<>();
//        while (!set.contains(n)) {
//            if (n == 1)
//                return true;
//            set.add(n);
//            int t = 0;
//            while (n != 0) {
//                t += (int)Math.pow(n % 10, 2);
//                n /= 10;
//            }
//            n = t;
//        }
//        return false;
        int fast = n, slow = n;
        while (true) {
            fast = helper(helper(fast));
            slow = helper(slow);
            if (fast == 1) return true;
            if (fast == slow) return false;
        }
    }

    private int helper(int n) {
        int t = 0;
        while (n != 0) {
            t += (int)Math.pow(n % 10, 2);
            n /= 10;
        }
        return t;
    }
}
