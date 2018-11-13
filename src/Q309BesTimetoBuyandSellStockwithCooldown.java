public class Q309BesTimetoBuyandSellStockwithCooldown {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len <= 0) return 0;
        int[] buy = new int[len + 1];
        int[] sell = new int[len + 1];
        buy[1] = -prices[0];
        for (int i = 2; i < len + 1; i++) {
            buy[i] = Math.max(sell[i - 2] - prices[i - 1], buy[i - 1]);
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i - 1]);
        }
        return sell[len];
    }
}