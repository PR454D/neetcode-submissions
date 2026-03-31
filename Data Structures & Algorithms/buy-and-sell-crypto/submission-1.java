class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int current = prices[i] - buy;
            if (current < 0) {
                buy = prices[i];
            } else if (current > maxProfit) {
                maxProfit = current;
            }
        }
        return maxProfit;
    }
}