package Algorithm.Solutions.LeetCode;

public class LeetCode1025 {
    public boolean divisorGame(int N) {
        boolean[] flag = new boolean[N + 2];

        flag[1] = false;
        flag[2] = true;
        for (int i = 3; i <= N; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0 && !flag[i - j]) {
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[N];
    }
}
