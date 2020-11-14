package Algorithm;

import Algorithm.Solutions.CrackingTheCodeInterview.*;
import Algorithm.Solutions.FightForOffer.*;
import Algorithm.Solutions.LeetCode.*;
import Algorithm.Solutions.CodeInterview.*;
import Algorithm.Solutions.LeetCodeCompet.*;
import Algorithm.Solutions.SortForInterview.BubbleSort;
import Algorithm.UsefulDataStructure.*;
import Algorithm.UsefulDataStructure.utils.*;

import java.util.*;

public class MainDrive {
    public static void main(String[] args) {
        System.out.println(Solution.minimumDeletions("baababbaabbaaabaabbabbbabaaaaaabaabababaaababbb"));
    }
}

class Solution {

    public static int minimumDeletions(String s) {
        return new CompeteQuestion5551().minimumDeletions(s);
    }

    public static int[] decrypt(int[] code, int k) {
        return new CompeteQuestion5550().decrypt(code, k);
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        return new LeetCode1122().relativeSortArray(arr1, arr2);
    }

    public static ListNode oddEvenList(ListNode head) {
        return new LeetCode328().oddEvenList(head);
    }

    public static int[] sortArrayByParityII(int[] A) {
        return new LeetCode922().sortArrayByParityII(A);
    }

    public static int findRotateSteps(String ring, String key) {
        return new LeetCode514().findRotateSteps(ring, key);
    }

    public static void nextPermutation(int[] nums) {
        new LeetCode31().nextPermutation(nums);
    }

    public static int[][] kClosest(int[][] points, int K) {
        return new LeetCode973().kClosest(points, K);
    }

    public static int maxProfit(int[] prices) {
        return new LeetCode123().maxProfit(prices);
    }

    public static int countRangeSum(int[] nums, int lower, int upper) {
        return new LeetCode327().countRangeSum(nums, lower, upper);
    }

    public static int[] sortByBits(int[] arr) {
        return new LeetCode1356().sortByBits(arr);
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        return new LeetCode127().ladderLength(beginWord, endWord, wordList);
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        return new LeetCode57().insert(intervals, newInterval);
    }

    public static boolean validMountainArray(int[] A) {
        return new LeetCode941().validMountainArray(A);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        return new LeetCode349().intersection(nums1, nums2);
    }

    public static List<String> wordBreak(String s, List<String> wordDict) {
        return new LeetCode140().wordBreak(s, wordDict);
    }

    public static int islandPerimeter(int[][] grid) {
        return new LeetCode463().islandPerimeter(grid);
    }

    public static int[] spiralOrder(int[][] matrix) {
        return new offer29().spiralOrder(matrix);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        return new LeetCode1207().uniqueOccurrences(arr);
    }

    public static boolean isSymmetric(TreeNode root) {
        return new offer28().isSymmetric(root);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        return new LeetCode1365().smallerNumbersThanCurrent(nums);
    }

    public static int longestMountain(int[] A) {
        return new LeetCode845().longestMountain(A);
    }

    public static TreeNode mirrorTree(TreeNode root) {
        return new offer27().mirrorTree(root);
    }

    public static boolean isSubStructure(TreeNode A, TreeNode B) {
        return new offer26().isSubStructure(A, B);
    }

    public static boolean isPanlindrome(ListNode head) {
        return new LeetCode234().isPalindrome(head);
    }

    public static List<Integer> partitionLabels(String S) {
        return new LeetCode763().partitionLabels(S);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return new offer25().mergeTwoLists(l1, l2);
    }

    public static boolean isLongPressedName(String name, String typed) {
        return new LeetCode925().isLongPressedName(name, typed);
    }

    public static void reorderList(ListNode head) {
        new LeetCode143().reorderList(head);
    }

    public static boolean backspaceCompare(String S, String T) {
        return new LeetCode844().backspaceCompare(S, T);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        return new LeetCode19().removeNthFromEnd(head, n);
    }

    public static int[] bestCoordinate(int[][] towers, int radius) {
        return new CompeteQuestion5528().bestCoordinate(towers, radius);
    }

    public static double trimMean(int[] arr) {
        return new CompeteQuestion5122().trimMean(arr);
    }

    public static int totalNQueens(int n) {
        return new LeetCode52().totalNQueens(n);
    }

    public static int[] sortedSquares(int[] A) {
        return new LeetCode977().sortedSquares(A);
    }

    public static int[] exchange(int[] nums) {
        return new offer21().exchange(nums);
    }

    public static List<String> commonChars(String[] A) {
        return new LeetCode1002().commonChars(A);
    }

    public static boolean isNumber(String s) {
        return new offer20().isNumber(s);
    }

    public static ListNode swapPairs(ListNode head) {
        return new LeetCode24().swapPairs(head);
    }

    public static int getMinimumDifference(TreeNode root) {
        return new LeetCode530().getMinimumDifference(root);
    }

    public static boolean canPartition(int[] nums) {
        return new LeetCode416().canPartition(nums);
    }

    public static boolean PredictTheWinner(int[] nums) {
        return new LeetCode486().PredictTheWinner(nums);
    }

    public static int[] printNumbers(int n) {
        return new offer17().printNumbers(n);
    }

    public static void reverseString(char[] s) {
        new LeetCode344().reverseString(s);
    }

    public static double myPow(double x, int n) {
        return new offer16().myPow(x, n);
    }

    public static int[] sumOfDistancesInTree(int N, int[][] edges) {
        return new LeetCode834().sumOfDistancesInTree(N, edges);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        return new LeetCode15().threeSum(nums);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        return new LeetCode18().fourSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        return new LeetCode1().twoSum(nums, target);
    }

    public static int numJewelsInStones(String J, String S) {
        return new LeetCode771().numJewelsInStones(J, S);
    }

    public static int minimumOperations(String leaves) {
        return new LCP19().minimumOperations(leaves);
    }

    public static int movingCount(int m, int n, int k) {
        return new offer13().movingCount(m, n, k);
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return new LeetCode106().buildTree(inorder, postorder);
    }

    public static int[] findMode(TreeNode root) {
        return new LeetCode501().findMode(root);
    }

    public static int numWays(int n) {
        return new offer10q2().numWays(n);
    }

    public static int minSubarray(int[] nums, int p) {
        return new CompeteQuestion5504().minSubarray(nums, p);
    }

    public static int maxSumRangeQuery(int[] nums, int[][] requests) {
        return new CompeteQuestion5505().maxSumRangeQuery(nums, requests);
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        return new CompeteQuestion5503().sumOddLengthSubarrays(arr);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        return new LeetCode47().permuteUnique(nums);
    }

    public static int[] findRedundantDirectedConnection(int[][] edges) {
        return new LeetCode685().findRedundantDirectedConnection(edges);
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        return new LeetCode216().combinationSum3(k, n);
    }

    public static int minArray(int[] numbers) {
        return new offer11().minArray(numbers);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        return new LeetCode40().combinationSum2(candidates, target);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        return new LeetCode39().combinationSum(candidates, target);
    }

    public static List<List<Integer>> combine(int n, int k) {
        return new LeetCode77().combine(n, k);
    }

    public static int fib(int n) {
        return new offer10q1().fib(n);
    }

    public static int findLengthOfShortestSubarray(int[] arr) {
        return new CompeteQuestion5493().findLengthOfShortestSubarray(arr);
    }

    public static int numWays(String s) {
        return new CompeteQuestion5492().numWays(s);
    }

    public static int diagonalSum(int[][] mat) {
        return new CompeteQuestion5491().diagonalSum(mat);
    }

    public static String getPermutation(int n, int k) {
        return new LeetCode60().getPermutation(n, k);
    }

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

//    public static int[] twoSum(int[] numbers, int target) {
//        return new LeetCode167().twoSum(numbers, target);
//    }

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

//    public static int maxProfit(int[] prices) {
//        return new LeetCode122().maxProfit(prices);
//    }

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