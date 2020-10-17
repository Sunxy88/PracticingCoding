package Algorithm.Solutions.LeetCodeCompet;

import java.util.Arrays;

public class CompeteQuestion5122 {

    public double trimMean(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        int ignoreNumber = (int)(len * 0.05);

        double sum = 0.0;
        for (int i = ignoreNumber; i < len - ignoreNumber; i++) {
            sum += arr[i];
        }

        return sum / (len - 2 * ignoreNumber);
    }

}
