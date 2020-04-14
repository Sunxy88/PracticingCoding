package Algorithm;

import Algorithm.Solutions.FightForOffer.*;

import java.util.Arrays;

public class MainDrive {
    public static void main(String[] args) {
        System.out.println(Solution.verifyPostorder(new int[] {1, 6, 3, 2, 5}));
    }
}

class Solution {
    public static String reverseLeftWords(String s, int n) {
        return new offer58q2().reverseLeftWords(s, n);
    }

    public static String[] permutation(String s) {
        return new offer38().permutation(s);
    }

    public static int lastRemaining(int n, int m) {
        return new offer62().lastRemaining(n, m);
    }

    public static int[][] findContinuousSequence(int target) {
        return new offer57q2().findContinuousSequence(target);
    }

    public static int cuttingRope(int n) {
        System.out.println(new offer14q1().cuttingRope(n));
        return new offer14q2().cuttingRope(n);
    }

    public static int hammingWeight(int n) {
        return new offer15().hammingWeight(n);
    }

    public static boolean verifyPostorder(int[] postorder) {
        return new offer33().verifyPostorder(postorder);
    }
}