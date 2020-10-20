package Algorithm.Solutions.LeetCode;

public class LeetCode925 {

    public boolean isLongPressedName(String name, String typed) {
        if (name == null || name.length() == 0 || typed == null || typed.length() == 0) {
            return false;
        }

        int name_ptr = 0, typed_ptr = 0;
        char[] c_name = name.toCharArray(), c_typed = typed.toCharArray();
        int len_name = c_name.length, len_typed = c_typed.length;

        while (name_ptr < len_name && typed_ptr < len_typed) {
            if (c_name[name_ptr] == c_typed[typed_ptr]) {
                name_ptr++;
                typed_ptr++;
                continue;
            }
            if (name_ptr != 0 && c_typed[typed_ptr] == c_name[name_ptr - 1]) {
                typed_ptr++;
            } else {
                return false;
            }
        }

        if (name_ptr != len_name) {
            return false;
        }

        while (typed_ptr < len_typed) {
            if (c_typed[typed_ptr] != c_name[len_name - 1]) {
                return false;
            }
            typed_ptr++;
        }

        return true;
    }

}
