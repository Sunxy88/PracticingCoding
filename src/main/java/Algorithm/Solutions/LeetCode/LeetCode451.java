package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LeetCode451 {
    class Node {
        public char c;
        public int frequency;
        public Node(char c, int f) {
            this.c = c;
            this.frequency = f;
        }
        public Node setFrequency(int f) {
            this.frequency = f;
            return this;
        }
    }
    public String frequencySort(String s) {

        if (s == null || s.length() == 0)
            return "";

        Map<Character, Node> map = new HashMap<>();
        char[] cs = s.toCharArray();

        for (char c : cs) {
            if (!map.isEmpty() && map.containsKey(c)) {
                Node t = map.get(c);
                map.put(c, t.setFrequency(t.frequency + 1));
            } else {
                map.put(c, new Node(c, 1));
            }
        }

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o2.frequency - o1.frequency);

        for (Node t : map.values()) {
            pq.offer(t);
        }

        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            Node t = pq.poll();
            while (t.frequency > 0) {
                sb.append(t.c);
                t.frequency--;
            }
        }

        return sb.toString();
    }
}
