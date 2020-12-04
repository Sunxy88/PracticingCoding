package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode659 {

//    public boolean isPossible(int[] nums) {
//        if (nums == null || nums.length < 3) {
//            return false;
//        }
//
//        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
//
//        for (int num : nums) {
//            if (!map.containsKey(num)) {
//                map.put(num, new PriorityQueue<>());
//            }
//            if (map.containsKey(num - 1)) {
//                int prevLength = map.get(num - 1).poll();
//                if (map.get(num - 1).isEmpty()) {
//                    map.remove(num - 1);
//                }
//                map.get(num).offer(prevLength + 1);
//            } else {
//                map.get(num).offer(1);
//            }
//        }
//
//        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
//            if (entry.getValue().peek() < 3) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public boolean isPossible(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> endMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            int count = countMap.getOrDefault(num, 0);
            if (count == 0) {
                continue;
            }
            int prevLength = endMap.getOrDefault(num - 1, 0);
            if (prevLength > 0) {
                endMap.put(num, endMap.getOrDefault(num, 0) + 1);
                endMap.put(num - 1, prevLength - 1);
                countMap.put(num, count - 1);
            } else {
                int cnt1 = countMap.getOrDefault(num + 1, 0);
                int cnt2 = countMap.getOrDefault(num + 2, 0);
                if (cnt1 > 0 && cnt2 > 0) {
                    countMap.put(num, countMap.get(num) - 1);
                    countMap.put(num + 1, cnt1 - 1);
                    countMap.put(num + 2, cnt2 - 1);
                    endMap.put(num + 2, endMap.getOrDefault(num + 2, 0) + 1);
                } else {
                    return false;
                }
            }
        }

        return true;
    }

}
