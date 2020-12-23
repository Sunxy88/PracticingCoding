package Algorithm.Solutions.FightForOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class offer45 {

    public String minNumber(int[] nums) {
        List<String> list = new ArrayList<>();

        for (int num : nums) {
            list.add(Integer.toString(num));
        }

        list.sort((str1, str2) -> (str1 + str2).compareTo(str2 + str1));

        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
        }

        return sb.toString();
    }

}
