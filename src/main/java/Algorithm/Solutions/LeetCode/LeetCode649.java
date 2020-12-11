package Algorithm.Solutions.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode649 {

    public String predictPartyVictory(String senate) {
        int len = senate.length();
        Queue<Integer> R = new LinkedList<>();
        Queue<Integer> D = new LinkedList<>();

        for (int i = 0; i < len; i++) {
            if (senate.charAt(i) == 'R') {
                R.offer(i);
            } else {
                D.offer(i);
            }
        }

        while (!R.isEmpty() && !D.isEmpty()) {
            int rIndex = R.poll(), dIndex = D.poll();
            if (rIndex < dIndex) {
                R.offer(rIndex + len);
            } else {
                D.offer(dIndex + len);
            }
        }

        return R.isEmpty() ? "Dire" : "Radiant";
    }

}
