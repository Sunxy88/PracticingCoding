package Algorithm.Solutions.FightForOffer;

public class offer05 {
    public String replaceSpace(String s) {
        if (s == null || s.length() == 0)
            return "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
