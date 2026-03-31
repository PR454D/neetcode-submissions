class Solution:
    def tribonacci(self, n: int) -> int:
        memo = {0: 0, 1: 1, 2: 1}
        def helper(k):
            if k < 2:
                return k
            if k in memo:
                return memo[k]
            memo[k] = helper(k - 1) + helper(k - 2) + helper(k - 3)
            return memo[k]
        
        return helper(n)
            
            