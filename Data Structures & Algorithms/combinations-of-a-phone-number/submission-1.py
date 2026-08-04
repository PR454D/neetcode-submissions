class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        nums = {
            "2": "abc",
            "3": "def",
            "4": "ghi",
            "5": "jkl",
            "6": "mno",
            "7": "pqrs",
            "8": "tuv",
            "9": "wxyz",
        }
        res = []
        if not digits:
            return res
        def dfs(i: int, curr: str):
            if len(curr) == len(digits):
                res.append(curr)
                return

            for char in nums[digits[i]]:
                dfs(i + 1, curr + char)

        dfs(0, "")
        return res
