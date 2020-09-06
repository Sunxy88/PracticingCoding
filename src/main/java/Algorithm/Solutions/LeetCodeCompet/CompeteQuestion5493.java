package Algorithm.Solutions.LeetCodeCompet;

public class CompeteQuestion5493 {
    public int findLengthOfShortestSubarray(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;

        int left = 0, len = arr.length;

        while (left + 1 < len && arr[left] <= arr[left + 1]) {
            left++;
        }

        if (left == len - 1)
            return 0;

        int right = len - 1;

        while (right - 1 >= 0 && arr[right - 1] <= arr[right]) {
            right--;
        }

        int result = Math.min(len - left - 1, right);

        int i = 0, j = right;

        while (i <= left && j < len) {
            if (arr[i] <= arr[j]) {
                result = Math.min(result, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return result;
    }
}
