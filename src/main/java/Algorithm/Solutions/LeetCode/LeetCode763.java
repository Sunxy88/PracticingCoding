package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode763 {

    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();

        if (S == null || S.length() == 0) {
            return res;
        }

        int[] maxIndex = new int[26];
        int len = S.length();

        for (int i = 0; i < len; i++) {
            maxIndex[S.charAt(i) - 'a'] = i;
        }

        int ptr1 = 0, ptr2 = 0, curMaxIndex = maxIndex[S.charAt(0) - 'a'];

        while (ptr1 < len && ptr2 < len) {
            curMaxIndex = Math.max(curMaxIndex, maxIndex[S.charAt(ptr2) - 'a']);
            if (ptr2 == curMaxIndex) {
                res.add(ptr2 - ptr1 + 1);
                ptr1 = ptr2 + 1;
            }
            ptr2++;

        }

        return res;
    }

}
