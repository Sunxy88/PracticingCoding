package Algorithm.Solutions.CodeInterview;

public class Tencent2 {

    public static int[] sort(int[] ary) {
        if (ary == null || ary.length == 0) {
            return ary;
        }

        mergeSort(ary, 0, ary.length - 1);
        return ary;
    }

    private static void mergeSort(int[] ary, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(ary, start, mid);
        mergeSort(ary, 1 + mid, end);
        merge(ary, start, end);
        return;
    }

    private static void merge(int[] ary, int start, int end) {
        int mid = (start + end) / 2;
        int ptr1 = start, ptr2 = mid + 1;

        while (ptr1 <= end) {
            if (ary[ptr1] > ary[ptr2]) {
                int temp = ary[ptr2];
                for (int i = ptr2; i - 1 >= ptr1 ; i--) {
                    swap(ary, i, i - 1);
                }
                ary[ptr1] = temp;
                if (ptr2 < end) {
                    ptr2++;
                }
            }
            ptr1++;
        }
    }

    private static void swap(int[] ary, int i, int j) {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }
}
