package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode989 {

    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> res = new ArrayList<>();
        for (int i = A.length - 1; i >= 0; i--) {
            int sum = A[i] + K % 10;
            K /= 10;
            if (sum >= 10) {
                K += 1;
                sum -= 10;
            }
            res.add(sum % 10);
        }
        while (K > 0) {
            res.add(K % 10);
            K /= 10;
        }
        Collections.reverse(res);
        return res;
    }

}
