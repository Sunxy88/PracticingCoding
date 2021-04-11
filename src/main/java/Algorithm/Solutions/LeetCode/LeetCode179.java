package Algorithm.Solutions.LeetCode;

import java.util.Arrays;

public class LeetCode179 {

    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (str1, str2) -> (str2 + str1).compareTo(str1 + str2));

        StringBuilder sb = new StringBuilder();

        for (String str : strNums) {
            sb.append(str);
        }
        String res = sb.toString();

        return res.charAt(0) == '0' ? "0" : res;
    }

}
