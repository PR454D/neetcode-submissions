class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        n1, n2 = len(s1), len(s2)
        if n1 > n2:
            return False
        count1 = [0]*26
        count2 = [0]*26
        
        def freq(s):
            c = [0] * 26
            for ch in s:
                c[ord(ch) - ord('a')] += 1
            return c
        
        target = freq(s1)
        for i in range(n2 - n1 + 1):
            if freq(s2[i:i + n1]) == target:
                return True
        return False
