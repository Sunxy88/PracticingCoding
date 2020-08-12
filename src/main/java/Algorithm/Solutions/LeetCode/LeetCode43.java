package Algorithm.Solutions.LeetCode;

public class LeetCode43 {
    public String multiply(String num1, String num2) {
        if (num1 == null || num2 == null || num1.length() == 0 || num2.length() == 0)
            return "0";

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        String res = "0";

        for (int i = num2.length() - 1; i >= 0; i--) {
            int carry = 0;
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < num2.length() - 1 - i; j++)
                sb.append(0);

            int n2 = num2.charAt(i) - '0';

            for (int j = num1.length() - 1; j >= 0 || carry != 0; j--) {
                int n1 = j < 0 ? 0 : num1.charAt(j) - '0';
                int product = (n1 * n2 + carry) % 10;
                sb.append(product);
                carry = (n1 * n2 + carry) / 10;
            }
            res = addStrings(res, sb.reverse().toString());
        }
        return res;
    }

    private String addStrings(String num1, String num2) {
        if (num1.equals("0"))
            return num2;
        if (num2.equals("0"))
            return num1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1, j = num2.length() - 1; i >=0 || j >= 0 || carry != 0; i--, j--) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = (x + y + carry) % 10;
            sb.append(sum);
            carry = (x + y + carry) / 10;
        }
        return sb.reverse().toString();
    }
}
