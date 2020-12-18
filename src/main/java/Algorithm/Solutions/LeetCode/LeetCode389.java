package Algorithm.Solutions.LeetCode;

public class LeetCode389 {

    public char findTheDifference(String s, String t) {
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            cnt1[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            cnt2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < cnt1.length; i++) {
            if (cnt1[i] != cnt2[i]) {
                return (char) (i + 'a');
            }
        }

        return ' ';
    }

}
