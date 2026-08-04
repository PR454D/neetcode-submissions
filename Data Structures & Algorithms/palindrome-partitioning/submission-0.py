class Solution:
    def partition(self, s: str) -> List[List[str]]:
        res, word = [], []

        def recurse(j: int, i: int):
            if i >= len(s):
                if i == j:
                    res.append(word.copy())
                return
            if self.is_palindrome(s, j, i):
                word.append(s[j : i + 1])
                recurse(i + 1, i + 1)
                word.pop()
            
            recurse(j, i + 1)


        recurse(0, 0)
        return res

    def is_palindrome(self, s: str, l: int, r: int) -> bool:
        while l < r:
            if s[l] != s[r]:
                return False
            l, r = l + 1, r - 1
        return True
