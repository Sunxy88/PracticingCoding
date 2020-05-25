package Algorithm.Solutions.LeetCode;

import java.util.PriorityQueue;

public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        int l = 0, r = nums.length - 1, target = nums.length - k;
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int num : nums) {
//            pq.offer(num);
//        }
//        for (int i = 0; i < nums.length - k; i++) {
//            pq.poll();
//        }
//        return pq.peek();
        while (true) {
            int index = partitoin(nums, l, r);
            if (index == target)
                return nums[index];
            else if (index < target)
                l = index + 1;
            else
                r = index - 1;
        }
    }

    private int partitoin(int[] nums, int left, int right) {
        int pivot = nums[left];
        int j = left;
        for (int i = left + 1; i <= right; i++) {
            if (nums[i] <= pivot) {
                j++;
                swap(nums, i, j);
            }
        }
        swap(nums, left, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
