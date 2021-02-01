package Algorithm.Solutions.SortForInterview;

public class QuickSort {

    public static void intSort(Integer[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(Integer[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int pos = partition(arr, l, r);
        quickSort(arr, l, pos - 1);
        quickSort(arr, pos + 1, r);
    }

    private static int partition(Integer[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    private static void swap(Object[] A, int i, int j) {
        Object t = A[i];
        A[i] = A[j];
        A[j] = t;
    }
}

