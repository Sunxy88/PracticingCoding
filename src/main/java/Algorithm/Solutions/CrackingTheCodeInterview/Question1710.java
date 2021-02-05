package Algorithm.Solutions.CrackingTheCodeInterview;

public class Question1710 {

    public int majorityElement(int[] nums) {
        int cnt = 0, major = 0;

        for (int c : nums) {
            if (cnt == 0) {
                major = c;
                cnt++;
            } else {
                if (major == c) {
                    cnt++;
                } else {
                    cnt--;
                }
            }
        }
        cnt = 0;
        for (int c : nums) {
            if (major == c) {
                cnt++;
            }
        }
        if (cnt > nums.length / 2) {
            return major;
        }
        return -1;
    }

}
