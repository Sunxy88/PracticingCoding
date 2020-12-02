package Algorithm.Solutions.LeetCode;

public class LeetCode321 {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length, n = nums2.length;
        int[] res = new int[k];
        int start = Math.max(0, k - n), end = Math.min(k, m);

        for (int i = start; i <= end; i++) {
            int[] subsequence1 = maxSubsequence(nums1, i);
            int[] subsequence2 = maxSubsequence(nums2, k - i);
            int[] curMaxSubsequence = merge(subsequence1, subsequence2);
            if (compare(curMaxSubsequence, 0, res, 0) > 0) {
                System.arraycopy(curMaxSubsequence, 0, res, 0, k);
            }
        }

        return res;
    }

    private int[] maxSubsequence(int[] nums, int k) {
        int len = nums.length;
        int[] stack = new int[k];
        int top = -1;
        int remain = len - k;

        for (int num : nums) {
            while (top >= 0 && num > stack[top] && remain > 0) {
                top--;
                remain--;
            }
            if (top < k - 1) {
                stack[++top] = num;
            } else {
                remain--;
            }
        }
        return stack;
    }

    private int[] merge(int[] ary1, int[] ary2) {
        int len1 = ary1.length, len2 = ary2.length;

        if (len1 == 0) {
            return ary2;
        }
        if (len2 == 0) {
            return ary1;
        }

        int len = len1 + len2;
        int[] ary = new int[len];

        int i1 = 0, i2 = 0;

        for (int i = 0; i < len; i++) {
            if (compare(ary1, i1, ary2, i2) > 0) {
                ary[i] = ary1[i1++];
            } else {
                ary[i] = ary2[i2++];
            }
        }

        return ary;
    }

    private int compare(int[] ary1, int i1, int[] ary2, int i2) {
        int len1 = ary1.length, len2 = ary2.length;

        while (i1 < len1 && i2 < len2) {
            int diff = ary1[i1] - ary2[i2];
            if (diff != 0) {
                return diff;
            }
            i1++;
            i2++;
        }

        if (len1 == i1 && len2 == i2) {
            return 0;
        } else if (len1 == i1) {
            return -1;
        } else {
            return 1;
        }
    }
}
