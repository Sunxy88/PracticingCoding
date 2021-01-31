package Algorithm.Solutions.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode888 {

    public int[] fairCandySwap(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0) {
            return new int[] {0, 0};
        }

        int sumA = 0, sumB = 0;
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int a : A) {
            sumA += a;
            setA.add(a);
        }
        for (int b : B) {
            sumB += b;
            setB.add(b);
        }

        if (sumA == sumB) {
            return new int[] {0, 0};
        }

        int difference = Math.abs((sumA - sumB) / 2);
        if (sumA > sumB) {
            for (int b : B) {
                if (setA.contains(difference + b)) {
                    return new int[]{difference + b, b};
                }
            }
        } else {
            for (int a : A) {
                if (setB.contains(difference + a)) {
                    return new int[]{a, difference + a};
                }
            }
        }
        return new int[] {0, 0};
    }

}
