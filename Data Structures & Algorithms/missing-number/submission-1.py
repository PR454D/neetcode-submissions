class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        sumToN = int(n * (n + 1) / 2)
        return sumToN - sum(nums)
