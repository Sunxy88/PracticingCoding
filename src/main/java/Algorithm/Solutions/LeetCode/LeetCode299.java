package Algorithm.Solutions.LeetCode;

public class LeetCode299 {
    public String getHint(String secret, String guess) {
        int[] bucket = new int[10];
        int bull = 0, cow;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
                continue;
            }
            bucket[secret.charAt(i) - '0']++;
            bucket[guess.charAt(i) - '0']--;
        }
        int notMatched = 0;
        for (int value : bucket) {
            if (value > 0)
                notMatched += value;
        }
        cow = secret.length() - notMatched - bull;
        return bull + "A" + cow + "B";
    }
}
