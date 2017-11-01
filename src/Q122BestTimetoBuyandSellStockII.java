public class Q122BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int temp1=prices[0];
        int temp2=0;
        boolean is=false;
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(!is){
                if(prices[i]>temp1){
                    is=true;
                    temp2=prices[i];
                }else{
                    temp1=prices[i];
                }
            }else{
                if(prices[i]>temp2){
                    temp2=prices[i];
                }else{
                    profit=profit+temp2-temp1;
                    temp1=prices[i];
                    is=false;
                }
            }
        }
        if(is){
            profit=profit+temp2-temp1;
        }
        return profit;
    }
}
