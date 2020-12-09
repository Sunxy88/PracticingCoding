package Algorithm.Solutions.FightForOffer;

public class offer39 {

    public int majorityElement(int[] nums) {
        int x = 0, votes = 0;
        for (int num : nums) {
            if (votes == 0) {
                x = num;
            }
            votes += (x == num) ? 1 : -1;
        }
        return x;
    }

}
