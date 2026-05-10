
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = defaultdict(int)
        count = 0
        for n in nums:
            if not seen[n]:
                seen[n] = seen[n - 1] + seen[n + 1] + 1
                seen[n - seen[n - 1]] = seen[n]
                seen[n + seen[n + 1]] = seen[n]
                count = max(count, seen[n])
        return count
