class Solution {
    public int maxProfit(int[] prices) {

        int highestProfit = 0;
        // iterate through each prices ...
        for(int i = 0; i < prices.length - 1; ++i){
            // System.out.println(prices[i]);
            // ... besides the current elem, iterate via rest
            for(int j = i + 1; j < prices.length; ++j){
                // System.out.println(prices[j]);
                // possible measured profit 
                int profit = prices[j] - prices[i];
                if(profit < 1){
                    profit = 0;
                }
                else if(profit >= 1){
                    if(profit > highestProfit){
                        highestProfit = profit;
                    }
                }
            }

        }

        return highestProfit;
    }
}
