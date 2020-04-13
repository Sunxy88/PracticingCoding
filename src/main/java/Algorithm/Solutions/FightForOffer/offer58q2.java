package Algorithm.Solutions.FightForOffer;

public class offer58q2 {
    public String reverseLeftWords(String s, int n) {
        if (s == null || s.length() == 0)
            return "";
        if (n <= 0)
            return s;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++)
            sb.append(s.charAt(i));

        for (int i = 0; i < n; i++)
            sb.append(s.charAt(i));

        return sb.toString();
    }
}
