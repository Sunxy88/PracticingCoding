package Algorithm.Solutions.LeetCode;

public class LeetCode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || cost == null || gas.length == 0)
            return -1;
        int curGas = 0, totalGal = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGal += gas[i] - cost[i];
            curGas += gas[i] - cost[i];
            if (curGas < 0) {
                start = i + 1;
                curGas = 0;
            }
        }
        return totalGal >= 0 ? start : curGas;
    }
}
