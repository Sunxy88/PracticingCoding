package Algorithm.Solutions.CodeInterview;

import java.util.Arrays;

public class Tencent1 {

    public static int[] sort(int[] ary) {
        if (ary == null || ary.length == 0) {
            return ary;
        }

        ary = mergeSort(ary, 0, ary.length - 1);
        return ary;
    }

    private static int[] mergeSort(int[] ary, int start, int end) {
        if (start >= end) {
            return new int[] {ary[start]};
        }

        int mid = (start + end) / 2;
        int[] leftAry = mergeSort(ary, start, mid);
        int[] rightAry = mergeSort(ary, mid + 1, end);
        int[] ans = merge(leftAry, rightAry);

        return ans;
    }

    private static int[] merge(int[] leftAry, int[] rightAry) {
        int len1 = leftAry.length, len2 = rightAry.length;
        int[] ans = new int[len1 + len2];
        int ptr1 = 0, ptr2 = 0, ptr = 0;

        while (ptr1 < len1 && ptr2 < len2) {
            ans[ptr++] = leftAry[ptr1] < rightAry[ptr2] ? leftAry[ptr1++] : rightAry[ptr2++];
        }

        while (ptr1 < len1) {
            ans[ptr++] = leftAry[ptr1++];
        }

        while (ptr2 < len2) {
            ans[ptr++] = rightAry[ptr2++];
        }

        return ans;
    }

}
