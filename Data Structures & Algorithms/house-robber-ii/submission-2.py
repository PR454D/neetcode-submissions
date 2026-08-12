class Solution:
    def rob(self, nums: List[int]) -> int:
        return max(nums[0], self.rob_single(nums[1:]), self.rob_single(nums[:-1]))
        
    def rob_single(self, nums):    
        rob1, rob2 = 0, 0
        for i in range(len(nums)):
            temp = max(nums[i] + rob1, rob2)
            rob1 = rob2
            rob2 = temp
        return rob2