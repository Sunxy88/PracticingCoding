package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode123 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        Map<Key, Integer> map = new HashMap<>();
        return dfs(map, prices, 0, 0, 0);
    }

    private int dfs(Map<Key, Integer> map, int[] prices, int index, int status, int k) {
        Key key = new Key(index, status, k);
        if (map.containsKey(key)) {
            return map.get(key);
        }
        if (index == prices.length || k == 2) {
            return 0;
        }
        int a = 0, b = 0, c = 0;
        a = dfs(map, prices, index + 1, status, k);
        if (status == 1) {
            b = dfs(map, prices, index + 1, 0, k + 1) + prices[index];
        } else {
            c = dfs(map, prices, index + 1, 1, k) - prices[index];
        }
        map.put(key, Math.max(Math.max(a, b), c));
        return map.get(key);
    }


    private class Key {
        final int index;
        final int status;
        final int k;

        public Key(int index, int status, int k) {
            this.index = index;
            this.status = status;
            this.k = k;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Key key = (Key) o;

            if (index != key.index) {
                return false;
            }
            if (status != key.status) {
                return false;
            }
            return k == key.k;
        }

        @Override
        public int hashCode() {
            int result = index;
            result = 31 * result + status;
            result = 31 * result + k;
            return result;
        }
    }
}
