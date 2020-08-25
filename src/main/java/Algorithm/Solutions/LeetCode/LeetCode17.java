package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode17 {
    private Map<Character, String> map = new HashMap<>();

    {
        map.put('1', "!@#");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return res;

        backtrack(res, digits, 0, new StringBuilder());
        return res;
    }

    private void backtrack(List<String> res, String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            res.add(sb.toString());
        } else {

            char digit = digits.charAt(index);
            String letters = map.get(digit);

            for (int i = 0; i < letters.length(); i++) {
                sb.append(letters.charAt(i));
                backtrack(res, digits, index + 1, sb);
                sb.deleteCharAt(index);
            }
        }
    }
}
