class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int len = prices.length;
        int buy = 0; // index when buying
        for(int i=0;i<len;i++){
            int diff = prices[i] - prices[buy];
            if(prices[buy] > prices[i]) buy = i;
            // compute max of profit at index 0 and diff
            profit = Math.max(profit, diff);
        }
        return profit;
    }
}