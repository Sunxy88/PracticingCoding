package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode480 {

    public double[] medianSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        double[] ans = new double[len - k + 1];
        MedieumInStream dualHeap = new MedieumInStream(k);

        for (int i = 0; i < k - 1; i++) {
            dualHeap.insert(nums[i]);
        }

        for (int i = k - 1; i < len; i++) {
            dualHeap.insert(nums[i]);
            ans[i - k + 1] = dualHeap.getMedieum();
            dualHeap.erase(nums[i - k + 1]);
        }

        return ans;
    }

    class MedieumInStream {
        private PriorityQueue<Integer> lesser;
        private PriorityQueue<Integer> greater;
        private Map<Integer, Integer> delayed;
        private int n;
        private int lesserSize;
        private int greaterSize;

        public MedieumInStream(int n) {
            this.lesser = new PriorityQueue<>((o1, o2) -> o2.compareTo(o1));
            this.greater = new PriorityQueue<>((o1, o2) -> o1.compareTo(o2));
            this.delayed = new HashMap<>();
            this.n = n;
            this.lesserSize = 0;
            this.greaterSize = 0;
        }

        public double getMedieum() {
            return (n & 1) == 1 ? lesser.peek() : ((double)lesser.peek() + greater.peek()) / 2.0;
        }

        public void insert(int num) {
            if (lesser.isEmpty() || num <= lesser.peek()) {
                lesser.offer(num);
                lesserSize++;
            } else {
                greater.offer(num);
                greaterSize++;
            }
            makeBalance();
        }

        public void erase(int num) {
            delayed.put(num, delayed.getOrDefault(num, 0) + 1);
            if (num <= lesser.peek()) {
                lesserSize--;
                if (num == lesser.peek()) {
                    prune(lesser);
                }
            } else {
                greaterSize--;
                if (num == greater.peek()) {
                    prune(greater);
                }
            }
            makeBalance();
        }

        private void prune(PriorityQueue<Integer> heap) {
            while (!heap.isEmpty()) {
                int num = heap.peek();
                if (delayed.containsKey(num)) {
                    delayed.put(num, delayed.get(num) - 1);
                    if (delayed.get(num) == 0) {
                        delayed.remove(num);
                    }
                    heap.poll();
                } else {
                    break;
                }
            }
        }

        private void makeBalance() {
            if (lesserSize > greaterSize + 1) {
                greater.offer(lesser.poll());
                lesserSize--;
                greaterSize++;
                prune(lesser);
            } else if (lesserSize < greaterSize) {
                lesser.offer(greater.poll());
                lesserSize++;
                greaterSize--;
                prune(greater);
            }
        }
    }
}
