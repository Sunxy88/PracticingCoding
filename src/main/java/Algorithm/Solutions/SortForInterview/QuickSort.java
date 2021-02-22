package Algorithm.Solutions.SortForInterview;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] ary) {
        quicksort(ary, 0, ary.length - 1);
    }

    private static void quicksort(int[] ary, int l, int r) {
        if (l >= r) {
            return;
        }

        int pivot = partition(ary, l, r);
        quicksort(ary, l, pivot - 1);
        quicksort(ary, pivot + 1, r);
    }

    private static int partition(int[] ary, int l, int r) {
        if (l >= r) {
            return l;
        }

        int pivot = ary[r];
        int left = l, right = r;
        while (left < right) {
            while (left < right && ary[left] <= pivot) {
                left++;
            }
            ary[right] = ary[left];

            while (left < right && ary[right] >= pivot) {
                right--;
            }
            ary[left] = ary[right];
        }
        ary[right] = pivot;

        return right;
    }
}

