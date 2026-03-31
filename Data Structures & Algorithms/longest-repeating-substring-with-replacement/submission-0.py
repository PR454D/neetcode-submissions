class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        seen = {}
        left = 0
        max_f = 0
        max_len = 0

        for right in range(len(s)):
            seen[s[right]] = seen.get(s[right], 0) + 1
            max_f = max(max_f, seen[s[right]])
            
            if (right - left + 1) - max_f > k:
                seen[s[left]] -= 1
                left += 1
            
            max_len = max(max_len, right - left + 1)
        
        return max_len