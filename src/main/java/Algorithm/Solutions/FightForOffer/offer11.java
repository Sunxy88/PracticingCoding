package Algorithm.Solutions.FightForOffer;

public class offer11 {

    public int minArray(int[] numbers) {

        if (numbers == null || numbers.length == 0)
            return 0;

        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int mid = (l + r) >> 1;
            if (numbers[mid] > numbers[r]) {
                l = mid + 1;
            } else if (numbers[mid] < numbers[r]) {
                r = mid;
            } else {
                r--;
            }
        }

        return numbers[l];
    }
}
