package Algorithm.Solutions.LeetCode;

public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        int s;
        while (l < r) {
            s = numbers[l] + numbers[r];
            if (s > target)
                r--;
            else if (s < target)
                l++;
            else
                return new int[] {l + 1, r + 1};
        }
        return null;
    }
}
