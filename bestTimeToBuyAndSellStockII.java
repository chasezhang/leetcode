public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 0) return 0;
        int profit = 0;
        int buy = prices[0];
        int sell = buy;
        int i = 1;
        while(i < prices.length) {
            if (sell > prices[i]) {
                profit += sell - buy;
                buy = prices[i];
                sell = buy;
            }
            sell = prices[i];
            i++;
        }
        profit += sell - buy;
        
        return profit;
    }
}