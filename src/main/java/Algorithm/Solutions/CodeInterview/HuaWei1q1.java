package Algorithm.Solutions.CodeInterview;

import java.util.ArrayList;
import java.util.List;

// 字符串反转：给定一个含有字母和数字的字符串，实现以下规则的反转：
// 1. 字母反转，数字不反转；
// 2. 整体的字符串反转
// 例子 : 输入          输出
//     a12b34de       ed34b12a
//     a23b34c        c34b23a
public class HuaWei1q1 {

    public String reverse(String origin) {
        if (origin == null || origin.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        char[] origin_chars = origin.toCharArray();

        // 1. 按字母与数字分组统计有多少字串
        List<String> strings = new ArrayList<>();
        boolean number = isNumber(origin_chars[0]);

        for (char c : origin_chars) {
            if (number) {
                if (isNumber(c)) {
                    sb.append(c);
                } else {
                    strings.add(sb.toString());
                    sb = new StringBuilder();
                    sb.append(c);
                    number = !number;
                }
            } else {
                if (!isNumber(c)) {
                    sb.append(c);
                } else {
                    // 2. 如果是字母串则内部进行反转
                    strings.add(stringReverse(sb.toString()));
                    sb = new StringBuilder();
                    sb.append(c);
                    number = !number;
                }
            }
        }

        if (!number) {
            strings.add(stringReverse(sb.toString()));
        } else {
            strings.add(sb.toString());
        }
        // 3. 整体的字符串数组进行反转并拼接
        sb = new StringBuilder();
        for (int i = strings.size() - 1; i >= 0; i--) {
            sb.append(strings.get(i));
        }
        return sb.toString();

    }


    private  boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    private String stringReverse(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

}
