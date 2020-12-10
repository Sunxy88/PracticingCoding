package Algorithm.Solutions.FightForOffer;

import java.util.Arrays;

public class offer40 {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] arr, int l, int r, int k) {
        int pivot = partition(arr, l, r);
        if (pivot == k) {
            return Arrays.copyOf(arr, pivot + 1);
        }
        return pivot > k ? quickSearch(arr, l, pivot - 1, k) : quickSearch(arr, pivot + 1, r, k);
    }

    private int partition(int[] arr, int l, int r) {
        int v = arr[l];
        int i = l, j = r + 1;
        while (true) {
            while (++i <= r && arr[i] < v);
            while (--j >= l && arr[j] > v);
            if (i >= j) {
                break;
            }
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        arr[l] = arr[j];
        arr[j] = v;
        return j;
    }
}
