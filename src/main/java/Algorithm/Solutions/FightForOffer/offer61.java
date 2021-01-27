package Algorithm.Solutions.FightForOffer;

import java.util.Arrays;

public class offer61 {

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zerCounter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zerCounter++;
            } else {
                if (i > 0) {
                    if (nums[i - 1] == 0) {
                        continue;
                    }
                    if (nums[i] != 0 && nums[i] == nums[i - 1]) {
                        return false;
                    }
                    if (nums[i] - nums[i - 1] != 1) {
                        zerCounter -= nums[i] - nums[i - 1] - 1;
                        if (zerCounter < 0){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
