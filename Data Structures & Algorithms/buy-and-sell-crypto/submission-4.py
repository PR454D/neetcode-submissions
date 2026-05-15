class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res = 0
        buy = prices[0]
        for i in range(len(prices)):
            current = prices[i] - buy
            if current < 0:
                buy = prices[i]
            elif current > res:
                res = current
        return res