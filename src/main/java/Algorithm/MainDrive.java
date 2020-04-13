package Algorithm;

import Algorithm.Solutions.FightForOffer.*;

import java.util.Arrays;

public class MainDrive {
    public static void main(String[] args) {
        int[][] an = Solution.findContinuousSequence(15);
        for (int i = 0; i < an.length; i++) {
            for (int j = 0; j < an[i].length; j++)
                System.out.print(an[i][j] + " ");
            System.out.println();
        }
    }
}

class Solution {
    public static String reverseLeftWords(String s, int n) {
        return new offer58q2().reverseLeftWords(s, n);
    }

    public static String[] permutation(String s) {
        return new offer38().permutation(s);
    }

    public static int lastRemaining(int n, int m) {
        return new offer62().lastRemaining(n, m);
    }

    public static int[][] findContinuousSequence(int target) {
        return new offer57q2().findContinuousSequence(target);
    }
}