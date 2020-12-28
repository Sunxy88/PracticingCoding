package Algorithm.Solutions.FightForOffer;

public class offer50 {

    public char firstUniqChar(String s) {
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;
        }
        for (char c : s.toCharArray()) {
            if (map[c - 'a'] == 1) {
                return c;
            }
        }

        return ' ';
    }

}
