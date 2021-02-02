package Algorithm.Solutions.LeetCode;

public class LeetCode4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length, len = len1 + len2;
        int[] merged = new int[len];
        int i = 0, i1 = 0, i2 = 0;

        while (i1 < len1 && i2 < len2) {
            if (nums1[i1] <= nums2[i2]) {
                merged[i++] = nums1[i1++];
            } else {
                merged[i++] = nums2[i2++];
            }
        }

        while (i1 < len1) {
            merged[i++] = nums1[i1++];
        }

        while (i2 < len2) {
            merged[i++] = nums2[i2++];
        }

        return (len & 1) == 1 ? merged[len / 2] : ((double) merged[len / 2] + merged[(len - 1) / 2 ]) / 2.0;
    }

}
