class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        buy = prices[0]
        for i, price in enumerate(prices):
            current = price - buy;
            if current < 0:
                buy = price
            elif current > max_profit:
                max_profit = current
        return max_profit