class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       int minPrices = prices[0];
       for(int i = 1;i<prices.length;i++){
        int potentialProfit = prices[i]-minPrices;
        maxProfit = Math.max(maxProfit, potentialProfit);
        minPrices = Math.min(minPrices,prices[i]);
       }
       return maxProfit;
    }
    
}