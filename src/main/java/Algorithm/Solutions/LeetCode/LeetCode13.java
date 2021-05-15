package Algorithm.Solutions.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {

    private Map<Character, Integer> symbolValues = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int len;
        if (s == null || (len = s.length()) == 0) {
            return 0;
        }

        int ret = 0;

        for (int i = 0; i < len; i++) {
            int value1 = symbolValues.get(s.charAt(i));
            if (i + 1 < len && value1 < symbolValues.get(s.charAt(i + 1))) {
                ret -= value1;
            } else {
                ret += value1;
            }
        }

        return ret;
    }

}
