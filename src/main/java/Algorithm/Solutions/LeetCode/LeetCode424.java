package Algorithm.Solutions.LeetCode;

public class LeetCode424 {

    public int characterReplacement(String s, int k) {
        if (s == null) {
            return 0;
        }

        int[] counter = new int[26];
        int left = 0, right = 0, len = s.length();
        int maxLetterCounter = 0;

        while (right < len) {
            int index = s.charAt(right) - 'A';
            counter[index] += 1;
            maxLetterCounter = Math.max(maxLetterCounter, counter[index]);
            if (right - left + 1 - maxLetterCounter > k) {
                counter[s.charAt(left) - 'A'] -= 1;
                left++;
            }
            right++;
        }

        return right - left;
    }

}
