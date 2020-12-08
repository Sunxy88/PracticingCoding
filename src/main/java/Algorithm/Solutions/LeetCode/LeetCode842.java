package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode842 {

    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> res = new ArrayList<>();
        backtrack(res, S, S.length(), 0, 0, 0);
        return res;
    }

    private boolean backtrack(List<Integer> res, String S, int length, int index, int sum, int prev) {
        if (index == length) {
            return res.size() >= 3;
        }

        long currLong = 0;

        for (int i = index; i < length; i++) {
            if (i > index && S.charAt(index) == '0') {
                break;
            }
            currLong = currLong * 10 + S.charAt(i) - '0';
            if (currLong > Integer.MAX_VALUE) {
                break;
            }
            int curr = (int) currLong;
            if (res.size() >= 2) {
                if (curr < sum) {
                    continue;
                } else if (curr > sum) {
                    break;
                }
            }
            res.add(curr);
            if (backtrack(res, S, length, i + 1, prev + curr, curr)) {
                return true;
            } else {
                res.remove(res.size() - 1);
            }
        }

        return false;
    }
}
