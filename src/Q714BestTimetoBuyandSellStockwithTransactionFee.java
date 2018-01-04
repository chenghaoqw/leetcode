public class Q714BestTimetoBuyandSellStockwithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int ns=0,s=-prices[0];
        for(int i=1;i<prices.length;i++){
            ns=Math.max(ns,s+prices[i] - fee);
            s=Math.max(s,ns-prices[i]);
        }
        return ns;
    }
}
