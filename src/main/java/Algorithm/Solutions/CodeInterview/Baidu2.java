package Algorithm.Solutions.CodeInterview;

import java.util.Arrays;
import java.util.Scanner;

public class Baidu2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        System.out.println(n + ", " + m);
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(ary));

        int type, left, right;

        for (int i = 0; i < m; i++) {
            type = scanner.nextInt();
            left = scanner.nextInt();
            right = scanner.nextInt();
            System.out.println(type + ", " + left + ", " + right);
        }
    }



}
