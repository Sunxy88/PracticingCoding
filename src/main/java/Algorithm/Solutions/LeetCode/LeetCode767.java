package Algorithm.Solutions.LeetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode767 {

    public String reorganizeString(String S) {
        if (S == null || S.length() == 0) {
            return "";
        }

        int[] letterCount = new int[26];
        char[] cs = S.toCharArray();

        for (char c : cs) {
            letterCount[c - 'a']++;
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((o1, o2) -> letterCount[o2 - 'a'] - letterCount[o1 - 'a']);

        for (char c = 'a'; c <= 'z'; c++) {
            if (letterCount[c - 'a']> 0) {
                pq.offer(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (pq.size() > 1) {
            char letter1 = pq.poll();
            char letter2 = pq.poll();
            sb.append(letter1);
            sb.append(letter2);
            int index1 = letter1 - 'a', index2 = letter2 - 'a';
            letterCount[index1]--;
            letterCount[index2]--;
            if (letterCount[index1] > 0) {
                pq.offer(letter1);
            }
            if (letterCount[index2] > 0) {
                pq.offer(letter2);
            }
        }
        if (pq.size() > 0) {
            sb.append(pq.poll());
        }

        return sb.length() == cs.length ? sb.toString() : "";
    }
}
