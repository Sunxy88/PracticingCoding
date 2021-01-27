package Algorithm.Solutions.FightForOffer;

public class offer63 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int maxProfit = 0, minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            if (minPrice > price) {
                minPrice = price;
            } else if (maxProfit < price - minPrice) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

}
