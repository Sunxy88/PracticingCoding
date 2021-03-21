package Algorithm.Solutions.CodeInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baidu1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        scanner.nextLine();
        int[] ary = new int[N];
        String s = scanner.nextLine();
        for (int i = 0; i < N; i++) {
            ary[i] = s.charAt(i) - '0';
        }

        System.out.println(solution(ary));
    }

    private static int solution(int[] ary) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] dp = new int[ary.length];
        map.put(ary[0], 0);

        for (int i = 1; i < ary.length; i++) {
            if (map.containsKey(ary[i])) {
                dp[i] = Math.min(map.get(ary[i]) + 1, dp[i - 1] + 1);
            } else {
                dp[i] = dp[i - 1] + 1;
            }
            int min = Math.min(dp[i], map.getOrDefault(ary[i], Integer.MAX_VALUE));
            map.put(ary[i], min);
        }

        return dp[ary.length - 1];
    }

}
