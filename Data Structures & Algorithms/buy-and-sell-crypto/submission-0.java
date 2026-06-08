class Solution {
     public int maxProfit(int[] prices) {
        int miniuMumPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            miniuMumPrice = Math.min(miniuMumPrice, prices[i]);
            int profit = prices[i] - miniuMumPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
