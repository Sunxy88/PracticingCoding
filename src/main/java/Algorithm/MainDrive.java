package Algorithm;

import Algorithm.Solutions.FightForOffer.*;
import Algorithm.Solutions.LeetCode.*;

import java.util.List;
import java.util.Arrays;

public class MainDrive {
    public static void main(String[] args) {
        System.out.println(Solution.minDistance("sea", "eat"));
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

    public static int nthUglyNumber(int n) {
        return new offer49().nthUglyNumber(n);
    }

    public static int add(int a, int b) {
        return new offer65().add(a, b);
    }

    public static double[] twoSum(int n) {
        return new offer60().twoSum(n);
    }

    public static int countDigitOne(int n) {
        return new offer43().countDigitOne(n);
    }

    public static boolean canJump(int[] num) {
        return new LeetCode55().canJump(num);
    }

    public static int trap(int[] height) {
        return new LeetCode42().trap(height);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        return new LeetCode49().groupAnagrams(strs);
    }

    public static int uniquePaths(int m, int n) {
        return new LeetCode62().uniquePaths(m, n);
    }

    public static int minPathSum(int[][] grid) {
        return new LeetCode64().minPathSum(grid);
    }

    public static int minDistance(String word1, String word2) {
        return new LeetCode72().minDistance(word1, word2);
    }
}