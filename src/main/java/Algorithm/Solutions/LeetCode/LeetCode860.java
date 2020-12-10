package Algorithm.Solutions.LeetCode;

public class LeetCode860 {

    public boolean lemonadeChange(int[] bills) {
        if (bills == null || bills.length == 0) {
            return true;
        }
        int cnt5 = 0, cnt10 = 0;
        for (int b : bills) {
            if (b == 5) {
                cnt5++;
            } else if (b == 10) {
                cnt10++;
                cnt5--;
            } else if (b == 20) {
                if (cnt10 > 0) {
                    cnt10--;
                    cnt5--;
                } else {
                    cnt5 -= 3;
                }
            }
            if (cnt5 < 0) {
                return false;
            }
        }
        return cnt5 >= 0;
    }

}
