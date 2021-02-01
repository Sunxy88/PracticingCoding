package Algorithm.Solutions.SortForInterview;

import java.util.Comparator;

public class BubbleSort {

    public static void intSort(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = 0; i + 1 < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    public static <T> void sort(T[] arr, Comparator<T> cmp) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int i = 0; i + 1 < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (cmp.compare(arr[j - 1], arr[j]) > 0) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    private static void swap(Object[] A, int i, int j) {
        Object t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
}
