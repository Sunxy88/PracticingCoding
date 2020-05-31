package Algorithm.Solutions.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        if (candies == null || candies.length == 0)
            return res;

        int maxCandy = 0x80000000;
        for (int c : candies)
            if (c > maxCandy)
                maxCandy = c;

        for (int c : candies)
            if (c + extraCandies >= maxCandy)
                res.add(true);
            else
                res.add(false);

        return res;
    }
}
