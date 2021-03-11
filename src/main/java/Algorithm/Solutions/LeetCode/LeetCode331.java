package Algorithm.Solutions.LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode331 {

    public boolean isValidSerialization(String preorder) {
        int len;
        if (preorder == null || (len = preorder.length()) == 0) {
            return true;
        }

        int slots = 1;

        for (int i = 0; i < len; i++) {
            if (slots == 0) {
                return false;
            }
            char c = preorder.charAt(i);
            if (c == ',') {
                continue;
            } else if (c == '#') {
                slots--;
            } else {
                while (i < len && preorder.charAt(i) != ',') {
                    i++;
                }
                slots++;
            }

        }
        return slots == 0;
    }

}
