package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode1122 {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        if (arr1 == null ||  arr1.length == 0) {
            return arr1;
        }

        if (arr2 == null || arr2.length == 0) {
            Arrays.sort(arr1);
            return arr1;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int j : arr1) {
            if (map.containsKey(j)) {
                map.put(j, 1 + map.get(j));
            } else {
                map.put(j, 1);
            }
        }

        int index = 0;
        for (int j : arr2) {
            int curLength = map.get(j);
            while (curLength > 0) {
                arr1[index++] = j;
                curLength--;
            }
            map.remove(j);
        }

        int[] rest = new int[arr1.length - index];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            while (value-- > 0) {
                rest[i++] = key;
            }
        }

        Arrays.sort(rest);
        i = 0;
        while (index < arr1.length) {
            arr1[index++] = rest[i++];
        }

        return arr1;
    }

}
