package Algorithm.Solutions.LeetCodeCompet;

import java.util.HashMap;
import java.util.Map;

public class CompeteQuestion5618 {

    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> countMapper = new HashMap<>();

        for (int num : nums) {
            countMapper.put(num, countMapper.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        for (int num : nums) {
            int cntNum = countMapper.getOrDefault(num, 0);
            if (cntNum > 0) {
                if (k - num != num) {
                    int cntKNum = countMapper.getOrDefault(k - num, 0);
                    if (cntKNum > 0) {
                        ans++;
                        countMapper.put(num, cntNum - 1);
                        countMapper.put(k - num, cntKNum - 1);
                    }
                } else {
                    int cntKNum = countMapper.getOrDefault(k - num, 0);
                    if (cntKNum >= 2) {
                        ans++;
                        countMapper.put(num, cntNum - 2);
                    }
                }
            }
        }

        return ans;
    }

}
