package Algorithm.Solutions.CodeInterview;

import java.util.*;

/**
 * 3月21日笔试第三题
 * 通过50%，复杂度太高时间太久
 */
public class Tencent6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<int[]> arys = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int len = scanner.nextInt();
            int[] ary = new int[len];
            for (int j = 0; j < len; j++) {
                ary[j] = scanner.nextInt();
            }
            arys.add(ary);
        }

        int q = scanner.nextInt();

        while (q-- > 0) {
            int p = scanner.nextInt();
            int[] indexes = new int[p];
            for (int i = 0; i < p; i++) {
                indexes[i] = scanner.nextInt();
            }

            int k = scanner.nextInt();

            System.out.println(solve(arys, indexes, k));
        }
    }

    private static int solve(List<int[]> arys, int[] indexes, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int aryIndex : indexes) {
            int[] ary = arys.get(aryIndex - 1);
            for (int num : ary) {
                if (pq.isEmpty() || pq.size() < k) {
                    pq.offer(num);
                } else if (num < pq.peek()) {
                    pq.poll();
                    pq.offer(num);
                }
            }
        }

        return pq.peek();
    }
}
