package Algorithm.Solutions.LeetCode;

public class LeetCode275 {
    public int hIndex(int[] citations) {
        int mid, left = 0, right = citations.length - 1, n = citations.length;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (citations[mid] == n - mid) return n - mid;
            else if (citations[mid] > n - mid) right = mid - 1;
            else left = mid + 1;
        }
        return n - left;
    }
}
