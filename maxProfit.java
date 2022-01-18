class Solution {
    public int maxProfit(int[] prices) {
        /*
        Brutal Force:
        Iterate through 1-D array with two pointers and try out all possible combinations
        O(n^2)
        
        Optimized Solution:
        Have a variable to keep track of minimum price (first initliazed to be a maximum integer)
        Have a variable to keep track of current maximum profit 
        Iterate through given prices array to compute max_profit = max(max_profit,prices[i] - prices)
        */
        
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            
            max_profit = Math.max(max_profit, prices[i] - min_price);
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
        }
        return max_profit;
    }
}
