class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res: List[List[int]] = []

        nums.sort()

        def dfs(i: int, curr: List[int]):
            if i == len(nums):
                if curr not in res:
                    res.append(curr.copy())
                return
            curr.append(nums[i])
            dfs(i + 1, curr)
            curr.pop()
            dfs(i + 1, curr)
        
        dfs(0, [])
        return res