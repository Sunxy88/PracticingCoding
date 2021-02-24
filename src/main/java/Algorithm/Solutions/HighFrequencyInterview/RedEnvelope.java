package Algorithm.Solutions.HighFrequencyInterview;

import java.util.*;

public class RedEnvelope {

    private static final double minVal = 0.01;

    /**
     * 线段分割法：
     * 将红包总量看作一个线段的长度，然后确定N-1个切割点
     * @param totalAmount
     * @param totalNumber
     * @return
     */
    public static List<Double> hongbao(int totalAmount, int totalNumber) {
        List<Double> res = new ArrayList<>();
        if (totalAmount <= 0 || totalNumber <= 0) {
            return res;
        }

        Random random = new Random(System.currentTimeMillis());
        Set<Double> set = new HashSet<>();
        for (int i = 0; i < totalNumber; i++) {
            set.add(minVal + (totalAmount - minVal) * random.nextDouble());
        }


        Double[] amounts = set.toArray(new Double[0]);
        Arrays.sort(amounts);

//        第一个线段的长度
        res.add(amounts[0]);

        for (int i = 1; i < amounts.length; i++) {
//            除了最后一个线段的长度
            res.add(amounts[i] - amounts[i - 1]);
        }

//        最后一个线段的长度
        res.add(totalAmount - amounts[amounts.length - 1]);

        return res;
    }
}
