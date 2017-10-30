public class Q121BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int result = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int temp = prices[i] - min;
                if (temp > result) {
                    result = temp;
                }
            }
        }
        return result;
    }
}
