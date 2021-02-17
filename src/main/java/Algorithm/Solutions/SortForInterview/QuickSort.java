package Algorithm.Solutions.SortForInterview;

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
        int lessIndex = l - 1;

        for (int i = l; i < r; i++) {
            if (ary[i] < pivot) {
                lessIndex += 1;
                swap(ary, lessIndex, i);
            }
        }

        swap(ary, lessIndex + 1, r);
        return lessIndex + 1;
    }

    private static void swap(int[] ary, int x, int y) {
        int t = ary[x];
        ary[x] = ary[y];
        ary[y] = t;
    }
}

