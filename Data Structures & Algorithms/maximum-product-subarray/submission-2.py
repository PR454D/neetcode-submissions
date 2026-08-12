class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n = len(nums)
        res = nums[0]
        prefix, suffix = 0, 0
        for i in range(len(nums)):
            prefix = nums[i] * (1 if prefix == 0 else prefix)
            suffix = nums[n - 1 - i] * (1 if suffix == 0 else suffix)
            res = max(res, prefix, suffix)
        return res
