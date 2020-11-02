package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> set1 = new HashSet<>();

        for (int e : nums1) {
            set1.add(e);
        }

        List<Integer> res = new ArrayList<>();

        for (int e : nums2) {
            if (set1.contains(e) && !res.contains(e)) {
                res.add(e);
            }
        }

        int[] realRes = new int[res.size()];
        for (int i = 0; i < realRes.length; i++) {
            realRes[i] = res.get(i);
        }

        return realRes;
    }

}
