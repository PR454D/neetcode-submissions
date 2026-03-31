class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        count = {}
        for n in nums:
            if n in count:
                return n
            count[n] = 1
        
        current = 0
        next = nums[current]

        slow = nums[0]
        fast = nums[0]
        while True:
            slow = nums[slow]
            fast = nums[nums[fast]]
            if slow == fast:
                return nums[slow]
