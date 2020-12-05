package Algorithm.Solutions.LeetCode;

import java.util.*;

public class LeetCode621 {

    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }

        Integer[] hashtable = new Integer[26];
        Arrays.fill(hashtable, 0);
        for (char task : tasks) {
            hashtable[task - 'A']++;
        }

        int res = 0;
        while (hashtable[0] > 0) {
            while (hashtable[0] > 1) {
                hashtable[0]--;
                int k = 0;
                for (int j = 1; j < 26; j++) {
                    if (k == n) {
                        break;
                    }
                    if (hashtable[j] > 0) {
                        hashtable[j]--;
                        k++;
                    }
                }
                res += n + 1;
                Arrays.sort(hashtable, (o1, o2) -> o2 - o1);
            }
            if (hashtable[0] == 1) {
                res++;
                hashtable[0]--;
            }
            Arrays.sort(hashtable, (o1, o2) -> o2 - o1);
        }
        return res;
    }

}
