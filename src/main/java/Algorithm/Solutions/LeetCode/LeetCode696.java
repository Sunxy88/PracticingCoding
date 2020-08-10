package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode696 {
    public int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<>();
        int ptr = 0;

        while (ptr < s.length()) {
            char c = s.charAt(ptr);
            int cnt = 0;
            while (ptr < s.length() && s.charAt(ptr) == c) {
                cnt++;
                ptr++;
            }
            counts.add(cnt);
        }

        int ans = 0;
        for (int i = 1; i < counts.size(); i++) {
            ans += Math.min(counts.get(i - 1), counts.get(i));
        }
        return ans;
    }
}
