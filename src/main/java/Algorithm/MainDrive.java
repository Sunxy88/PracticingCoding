package Algorithm;

import Algorithm.Solutions.FightForOffer.*;
import Algorithm.Solutions.LeetCode.*;
import Algorithm.Solutions.CodeInterview.*;
import Algorithm.UsefulDataStructure.ListNode;

import java.util.Arrays;
import java.util.List;

public class MainDrive {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7}, 3)));
    }
}

class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        return new LeetCode239().maxSlidingWindow(nums, k);
    }

    public static String decodeString(String s) {
        return new LeetCode394().decodeString(s);
    }

    public static int findKthLargest(int[] nums, int k) {
        return new LeetCode215().findKthLargest(nums, k);
    }

    public static int findDuplicate(int[] nums) {
        return new LeetCode287().findDuplicate(nums);
    }

    public static int calculate(String s) {
        return new LeetCode224().calculate(s);
    }

    public static int evalRPN(String[] tokens) {
        return new LeetCode150().evalRPN(tokens);
    }

    public static String simplifyPath(String path) {
        return new LeetCode71().simplifyPath(path);
    }

    public static int mincostTickets(int[] days, int[] costs) {
        return new LeetCode983().mincostTickets(days, costs);
    }

    public static int rob(int[] nums) {
        return new LeetCode198().rob(nums);
    }

    public static int maxProduct(int[] nums) {
        return new LeetCode152().maxProduct(nums);
    }

    public static int jump(int[] nums) {
        return new LeetCode45().jump(nums);
    }

    public static int majorityElement(int[] nums) {
        return new LeetCode169().majorityElement(nums);
    }

    public static boolean isHappy(int n) {
        return new LeetCode202().isHappy(n);
    }

    public static int search(int[] nums, int target) {
        return new LeetCode33().search(nums, target);
    }

    public static int singleNumber(int[] nums) {
        return new LeetCode136().singleNumber(nums);
    }

    public static int longestConsecutive(int[] nums) {
        return new LeetCode128().longestConsecutive(nums);
    }

    public static List<List<Integer>> permute(int[] nums) {
        return new LeetCode46().permute(nums);
    }

    public static int maxProfit(int[] prices) {
        return new LeetCode121().maxProfit(prices);
    }

    public static int reversePairs(int[] nums) {
        return new offer51().reversePairs(nums);
    }

    public static int waysToChange(int n) {
        return new CodeInterview8Q11().waysToChange(n);
    }

    public static int numTrees(int n) {
        return new LeetCode96().numTrees(n);
    }

    public static int maximalRectangle(char[][] matrix) {
        return new LeetCode85().maximalRectangle(matrix);
    }

    public static int largestRectangleArea(int[] heights) {
        return new LeetCode84().largestRectangleArea(heights);
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        return new LeetCode1248().numberOfSubarrays(nums, k);
    }

    public static boolean exist(char[][] board, String word) {
        return new LeetCode79().exist(board, word);
    }

    public static int numIslands(char[][] grid) {
        return new LeetCode200().numIslands(grid);
    }

    public static int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        return new LeetCode466().getMaxRepetitions(s1, n1, s2, n2);
    }

    public static void sortColors(int[] nums) {
        new LeetCode75().sortColors(nums);
    }

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

    public static int maxArea(int[] height) {
        return new LeetCode11().maxArea(height);
    }
}