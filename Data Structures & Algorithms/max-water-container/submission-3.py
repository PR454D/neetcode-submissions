class Solution:
    def maxArea(self, heights: List[int]) -> int:
        left, right = 0, len(heights) - 1
        result = 0
        while left < right:
            height = min(heights[left], heights[right])
            length = right - left
            current_area = height * length
            result = max(result, current_area)
            if heights[left] < heights[right]:
                left += 1
            else:
                right -= 1
        return result
