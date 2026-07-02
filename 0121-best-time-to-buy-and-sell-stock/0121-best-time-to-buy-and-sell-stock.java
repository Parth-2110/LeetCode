class Solution {
    public int maxProfit(int[] prices) {
        
        int overallprofit = 0;
        int todaysprofit = 0;
        int lowestprice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < lowestprice){
                lowestprice = prices[i];
            }

            todaysprofit = prices[i] - lowestprice;
            if(todaysprofit > overallprofit){
                overallprofit = todaysprofit;
            }
        }

        return overallprofit;
    }
}