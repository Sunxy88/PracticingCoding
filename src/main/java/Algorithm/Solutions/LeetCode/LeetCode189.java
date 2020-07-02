package Algorithm.Solutions.LeetCode;

public class LeetCode189 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return ;
        int count = 0;
        k = k % nums.length;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (current != start);
        }
    }
}
