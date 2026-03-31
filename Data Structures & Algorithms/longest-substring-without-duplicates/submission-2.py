class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen_chars= {}
        result = 0
        l = 0
        for r, char in enumerate(s):
            if char in seen_chars:
                l = max(l, seen_chars[char] + 1)
            seen_chars[char] = r
            result = max(result, r - l + 1)
        return result