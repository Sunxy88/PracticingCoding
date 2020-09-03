package Algorithm;

import Algorithm.Solutions.CrackingTheCodeInterview.Question1618;
import Algorithm.Solutions.CrackingTheCodeInterview.Question1713;
import Algorithm.Solutions.FightForOffer.*;
import Algorithm.Solutions.LeetCode.*;
import Algorithm.Solutions.CodeInterview.*;
import Algorithm.UsefulDataStructure.ListNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainDrive {
    public static void main(String[] args) {
        System.out.println(Solution.replaceSpace("We are family"));
    }
}

class Solution {

    public static String replaceSpace(String s) {
        return new offer05().replaceSpace(s);
    }

    public static boolean judgeCircle(String moves) {
        return new LeetCode657().judgeCircle(moves);
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        return new offer04().findNumberIn2DArray(matrix, target);
    }

    public static List<String> letterCombinations(String digits) {
        return new LeetCode17().letterCombinations(digits);
    }

    public static List<List<Integer>> findSubsequences(int[] nums) {
        return new LeetCode491().findSubsequences(nums);
    }

    public static int rangeBitwiseAnd(int m, int n) {
        return new LeetCode201().rangeBitwiseAnd(m, n);
    }

    public static int findRepeatNumber(int[] nums) {
        return new offer03().findRepeatNumber(nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        return new LeetCode78().subsets(nums);
    }

    public static int removeBoxes(int[] boxes) {
        return new LeetCode546().removeBoxes(boxes);
    }

    public static boolean isValid(String s) {
        return new LeetCode20().isValid(s);
    }

    public static String addStrings(String num1, String num2) {
        return new LeetCode415().addStrings(num1, num2);
    }

    public static String multiply(String num1, String num2) {
        return new LeetCode43().multiply(num1, num2);
    }

    public static void solve(char[][] board) {
        new LeetCode130().solve(board);
    }

    public static int countBinarySubstrings(String s) {
        return new LeetCode696().countBinarySubstrings(s);
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        return new LeetCode207().canFinish(numCourses, prerequisites);
    }

    public static int firstUniqChar(String s) {
        return new LeetCode387().firstUniqChar(s);
    }

    public static int findMin(int[] nums) {
        return new LeetCode154().findMin(nums);
    }

    public static int[] twoSum(int[] numbers, int target) {
        return new LeetCode167().twoSum(numbers, target);
    }

    public static int strStr(String haystack, String needle) {
        return new LeetCode28().strStr(haystack, needle);
    }

    public static int maxCoins(int[] nums) {
        return new LeetCode312().maxCoins(nums);
    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        return new LeetCode97().isInterleave(s1, s2, s3);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        return new LeetCode219().containsNearbyDuplicate(nums, k);
    }

    public static int searchInsert(int[] nums, int target) {
        return new LeetCode35().searchInsert(nums, target);
    }

    public static int hIndex(int[] citations) {
        return new LeetCode274().hIndex(citations);
    }

    public static List<Integer> getRow(int rowIndex) {
        return new LeetCode119().getRow(rowIndex);
    }

    public static int respace(String[] dictionary, String sentence) {
        return new Question1713().respace(dictionary, sentence);
    }

    public static String getHint(String secret, String guess) {
        return new LeetCode299().getHint(secret, guess);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return new LeetCode63().uniquePathsWithObstacles(obstacleGrid);
    }

    public static void rotate(int[] nums, int k) {
        new LeetCode189().rotate(nums, k);
    }

    public static int removeDuplicates2(int[] nums) {
        return new LeetCode80().removeDuplicates(nums);
    }

    public static int minSubArrayLen(int s, int[] nums) {
        return new LeetCode209().minSubArrayLen(s, nums);
    }

    public static int firstMissingPositive(int[] nums) {
        return new LeetCode41().firstMissingPositive(nums);
    }

    public static int threeSumClosest(int[] nums, int target) {
        return new LeetCode16().threeSumClosest(nums, target);
    }

    public static boolean patternMatching(String pattern, String value) {
        return new Question1618().patternMatching(pattern, value);
    }

    public static String removeDuplicateLetters(String s) {
        return new LeetCode316().removeDuplicateLetters(s);
    }

    public static int removeDuplicates(int[] nums) {
        return new LeetCode26().removeDuplicates(nums);
    }

    public static boolean isMatch(String s, String p) {
        return new LeetCode10().isMatch(s, p);
    }

    public static int removeElement(int[] nums, int val) {
        return new LeetCode27().removeElement(nums, val);
    }

    public static boolean isPalindrome(String s) {
        return new LeetCode125().isPalindrome(s);
    }

    public static int minPatches(int[] nums, int n) {
        return new LeetCode330().minPatches(nums, n);
    }

    public static String longestCommonPrefix(String[] strs) {
        return new LeetCode14().longestCommonPrefix(strs);
    }

    public static int findBestValue(int[] arr, int target) {
        return new LeetCode1300().findBestValue(arr, target);
    }

    public static int[] dailyTemperatures(int[] T) {
        return new LeetCode739().dailyTemperatures(T);
    }

    public static boolean isSubsequence(String s, String t) {
        return new LeetCode392().isSubsequence(s, t);
    }

    public static int candy(int[] ratings) {
        return new LeetCode135().candy(ratings);
    }

    public static boolean isPalindrome(int x) {
        return new LeetCode9().isPalindrome(x);
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        return new LeetCode134().canCompleteCircuit(gas, cost);
    }

    public static String frequencySort(String s) {
        return new LeetCode451().frequencySort(s);
    }

    public static int[] productExceptSelf(int[] nums) {
        return new LeetCode238().productExceptSelf(nums);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        return new LeetCode1431().kidsWithCandies(candies, extraCandies);
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        return new LeetCode373().kSmallestPairs(nums1, nums2, k);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        return new LeetCode347().topKFrequent(nums, k);
    }

    public static int nthSuperUglyNumber(int n, int[] primes) {
        return new LeetCode313().nthSuperUglyNumber(n, primes);
    }

    public static int maxProfit(int[] prices) {
        return new LeetCode122().maxProfit(prices);
    }

    public static int nthUglyNumber(int n) {
        return new LeetCode264().nthUglyNumber(n);
    }

    public static boolean isUgly(int num) {
        return new LeetCode263().isUgly(num);
    }

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

//    public static int maxProfit(int[] prices) {
//        return new LeetCode121().maxProfit(prices);
//    }

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

//    public static int nthUglyNumber(int n) {
//        return new offer49().nthUglyNumber(n);
//    }

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