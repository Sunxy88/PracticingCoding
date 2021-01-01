package Algorithm.Solutions.LeetCode;

public class LeetCode605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len = flowerbed.length;
        int prev = -1;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 1) {
                if (prev < 0) {
                    count += i / 2;
                } else {
                    count += (i - prev - 2) / 2;
                }
                prev = i;
            }
        }
        if (prev < 0) {
            count += (len + 1) / 2;
        } else {
            count += (len - prev - 1) / 2;
        }
        return count >= n;
    }

}
