package Algorithm.Solutions.LeetCode;

public class LeetCode415 {

    public String addStrings(String num1, String num2) {
        if (ifNull(num1))
            return "0";
        if (ifNull(num2))
            return "0";

        StringBuilder res = new StringBuilder();
        int carry = 0;

        for (int i = num1.length() - 1, j = num2.length() - 1;
             i >= 0 || j >= 0 || carry != 0;
             i--, j--) {
            int n1 = i < 0 ? 0 : num1.charAt(i) - '0';
            int n2 = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = (n1 + n2 + carry) % 10;
            res.append(sum);
            carry = (n1 + n2 + carry) / 10;
        }
        return res.reverse().toString();
    }

    private boolean ifNull(String num1) {
        return num1 == null || num1.length() == 0 || num1.equals("0");
    }

}
