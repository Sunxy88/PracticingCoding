package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode466 {
    //这道题题目都没看懂。。大大方方承认抄的答案，循环节这东西可真牛逼
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        if (n1 == 0)
            return 0;
        int s1cnt = 0, s2cnt = 0, index = 0;
        int s1prime, s2prime, s1loop, s2loop;
        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();
        HashMap<Integer, Integer[]> map = new HashMap<>();
        while (true) {
            s1cnt++;
            for (Character c1 : s1c) {
                if (c1 == s2c[index]) {
                    index++;
                    if (index == s2c.length) {
                        s2cnt++;
                        index = 0;
                    }
                }
            }
            if (s1cnt == n1)
                return s2cnt / n2;

            if (map.containsKey(index)) {
                s1prime = map.get(index)[0];
                s2prime = map.get(index)[1];
                s1loop = s1cnt - s1prime;
                s2loop = s2cnt - s2prime;
                break;
            }
            else {
                map.put(index, new Integer[]{s1cnt, s2cnt});
            }
        }

        for (Map.Entry<Integer, Integer[]> entry : map.entrySet())
            System.out.println(entry.getKey() + ": " + entry.getValue()[0] + " - " + entry.getValue()[1]);

        int ans = s2prime + (n1 - s1prime) / s1loop * s2loop ;
        int rest = (n1 - s1prime) % s1loop;
        while (rest > 0) {
            for (char c1 : s1c) {
                if (c1 == s2c[index])
                    index++;
                if (index == s2c.length) {
                    ans++;
                    index = 0;
                }
            }
            rest--;
        }
        return ans / n2;
    }
}
