package Algorithm.Solutions.CodeInterview;

import java.util.*;

public class Meituan {
    public static void main(String[] args) {
        question5();
    }

    private static void question5() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        String axiel = scanner.next();
        int[] cost = new int[p];
        for (int i = 0; i < p; i++) {
            cost[i] = scanner.nextInt();
        }
        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 1; i < n; i++) {
            char pos = axiel.charAt(i);
            if (pos == 'o') {
                for (int j = 1; j <= p && i - j >= 0; j++) {
                    char prevPos = axiel.charAt(i - j);
                    if (prevPos == 'o') {
                        dp[i] = Math.min(dp[i], dp[i - j] + cost[j - 1]);
                    }
                }
            }
        }
        System.out.println(dp[n - 1]);
        // dp[i] = Math.min(dp[j] + cost[i - j])
    }

    private static void question4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // n个节点
        int m = scanner.nextInt(); // m条边
        int x = scanner.nextInt() - 1; // 起始位置
        int y = scanner.nextInt() - 1; // 目的位置
        int[][] carGraph = new int[n][n]; // 每条边车花费时间
        int[] totalCarGraph = new int[n]; // 第i个节点到终点的开车时间
        int[][] walkGraph = new int[n][n]; // 每条边走路花费时间
        int[] totalWalkGraph = new int[n]; // 第i个节点到终点的走路时间
        int[] waitTime = new int[n]; // 每个节点打车等待时间

        for (int i = 0; i <n; i++) {
            if (i != x) {
                totalWalkGraph[i] = Integer.MAX_VALUE;
            }
            if (i != y) {
                totalCarGraph[i] = Integer.MAX_VALUE;
            }
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                carGraph[i][j] = -1;
                carGraph[j][i] = -1;
                walkGraph[i][j] = -1;
                walkGraph[j][i] = -1;
            }
        }

        for (int i = 0; i < m; i++) {
            int p1 = scanner.nextInt() - 1;
            int p2 = scanner.nextInt() - 1;
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            carGraph[p1][p2] = p;
            carGraph[p2][p1] = p;
            walkGraph[p1][p2] = q;
            walkGraph[p2][p1] = q;
        }

        for (int i = 0; i < n; i++) {
            waitTime[i] = scanner.nextInt();
        }

        // Dijkstra算法计算出每个节点到终点的打车时间和步行时间
        Set<Integer> visited = new HashSet<>();
        visited.add(y); // 打车时间从终点开始计算
        while (visited.size() != n) {
            Set<Integer> toAdd = new HashSet<>();
            for (Integer node : visited) {
                for (int i = 0; i< n; i++) {
                    if (carGraph[i][node] >= 0) {
                        toAdd.add(i);
                        totalCarGraph[i] = Math.min(totalCarGraph[i], carGraph[i][node] + totalCarGraph[node]);
                    }
                }
            }
            visited.addAll(toAdd);
        }

        visited = new HashSet<>();
        visited.add(x); // 步行时间从起点开始计算
        while (visited.size() != n) {
            Set<Integer> toAdd = new HashSet<>();
            for (Integer node : visited) {
                for (int i = 0; i< n; i++) {
                    if (walkGraph[i][node] >= 0) {
                        toAdd.add(i);
                        totalWalkGraph[i] = Math.min(totalWalkGraph[i],walkGraph[i][node] + totalWalkGraph[node]);
                    }
                }
            }
            visited.addAll(toAdd);
        }

        int minTime = Integer.MAX_VALUE;
        // 计算每个节点到终点的花费时间，维护最小值
        for (int i = 0; i < n; i++) {
            int time = Math.max(i == y ? 0 : waitTime[i], totalWalkGraph[i]) + totalCarGraph[i];
            minTime = Math.min(time, minTime);
        }
        // 计算公式 time = Math.max(waitTime, walkTime) + carTime
        System.out.println(minTime);
    }

    private static void question3() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 当前位置
        int[] pos = new int[n];
        // 移动方向
        char[] directions = new char[n];
        // 答案
        int[] ans = new int[n];
        // 方向向右的最左边的机器人
        int rightestRobot = Integer.MAX_VALUE;
        // 方向向左的最右边的机器人
        int leftestRobot = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            String dir = scanner.next();
            pos[i] = p;
            directions[i] = dir.trim().charAt(0);
            ans[i] = -1; // 默认都不会爆炸
            if (directions[i] == 'R') {
                rightestRobot = Math.min(rightestRobot, pos[i]);
            }
            if (directions[i] == 'L') {
                leftestRobot = Math.max(leftestRobot, pos[i]);
            }
        }

        int epoch = 0;
        while (rightestRobot <= leftestRobot) {
            epoch += 1;
            // 判断方向向右的最左边的机器人和方向向左的最右边的机器人是否已经错过，如果错过则结束
            rightestRobot = Integer.MAX_VALUE;
            leftestRobot = Integer.MIN_VALUE;
            Map<Integer, List<Integer>> curPosMap = new HashMap<>(); // 用于记录当前各个点上未爆炸的机器人编号
            for (int i = 0; i < n; i++) {
                if (ans[i] > 0) {
                    continue;
                }
                // 更新未爆炸的机器人位置信息，维护方向向右的最左边的机器人和方向向左的最右边的机器人位置
                if (directions[i] == 'R') {
                    pos[i] += 1;
                    rightestRobot = Math.min(rightestRobot, pos[i]);
                    List<Integer> robots = curPosMap.getOrDefault(pos[i], new ArrayList<>());
                    robots.add(i);
                    curPosMap.put(pos[i], robots);
                }
                if (directions[i] == 'L') {
                    pos[i] -= 1;
                    leftestRobot = Math.max(leftestRobot, pos[i]);
                    List<Integer> robots = curPosMap.getOrDefault(pos[i], new ArrayList<>());
                    robots.add(i);
                    curPosMap.put(pos[i], robots);
                }
            }
            // 判断是否出现爆炸
            for (Map.Entry<Integer, List<Integer>> entry : curPosMap.entrySet()) {
                int p = entry.getKey();
                List<Integer> robots = entry.getValue();
                if (robots.size() > 1) {
                    // 大于1则表示出现爆炸
                    for (Integer robot : robots) {
                        if (ans[robot] < 0) {
                            ans[robot] = epoch;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }

    private static void question2() {
        // 在字符串尾部最少新增几个字符可以构成回文串
        Scanner scanner = new Scanner(System.in);
        String originStr = scanner.next();

    }

    private static void question1() {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T > 0) {
            T -= 1;
            int n = scanner.nextInt();
            int[] ary = new int[n];
            int i = 0;
            while (n > 0) {
                n -= 1;
                ary[i++] = scanner.nextInt();
            }
            Arrays.sort(ary);
            boolean flag = ary[0] == 1;
            for (i = 1; i < ary.length && flag; i++) {
                if (ary[i] - 1 != ary[i - 1]) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "Yes" : "No");
        }
    }
}
