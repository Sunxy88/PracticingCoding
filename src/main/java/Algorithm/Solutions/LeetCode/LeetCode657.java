package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode657 {

    public boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0)
            return true;

        int[] pos = new int[]{0, 0};
        Map<Character, int[]> map = new HashMap<>();
        map.put('L', new int[]{0, -1});
        map.put('R', new int[]{0, 1});
        map.put('U', new int[]{-1, 0});
        map.put('D', new int[]{1, 0});

        for (int i = 0; i < moves.length(); i++) {
            int[] dir = map.get(moves.charAt(i));
            pos[0] += dir[0];
            pos[1] += dir[1];
        }

        return pos[0] == 0 && pos[1] == 0;
    }
}
