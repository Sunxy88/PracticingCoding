package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode922 {

    public int[] sortArrayByParityII(int[] A) {
        int ptr_odd = 1;
        for (int ptr_even = 0; ptr_even < A.length; ptr_even += 2) {
            if (A[ptr_even] % 2 == 1) {
                while (A[ptr_odd] % 2 == 1) {
                    ptr_odd += 2;
                }
                swap(A, ptr_even, ptr_odd);
            }
        }
        return A;
    }

    private void swap(int[] A, int i, int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

}
