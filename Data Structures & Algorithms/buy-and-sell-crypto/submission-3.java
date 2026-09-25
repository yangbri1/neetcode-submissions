class Solution {
    public int maxProfit(int[] prices) {

        int highestProfit = 0;
        // iterate through each prices ...
        // Note: -1 shift is so the internal loop DN go out of bound towards the end
        for(int i = 0; i < prices.length - 1; ++i){
            // System.out.println(prices[i]);
            // ... besides the current elem, iterate via rest
            for(int j = i + 1; j < prices.length; ++j){
                // System.out.println(prices[j]);
                // possible measured profit 
                int profit = prices[j] - prices[i];
                // if the profit is either 0 or negative in value ...
                // ... that is a deficit (just diamond hand it!)
                if(profit < 1){
                    profit = 0;
                }
                // otw if the profit is 1 or + &&...
                else if(profit >= 1){
                    // ... it is greater than the previously recorded profit ...
                    if(profit > highestProfit){
                        // take notes of the new highest record profit!
                        highestProfit = profit;
                    }
                }
            }

        }

        return highestProfit;
    }
}
