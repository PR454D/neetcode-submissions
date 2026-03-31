class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        if not matrix or len(matrix) == 0 or len(matrix[0]) == 0:
            return False
        m = len(matrix)
        n = len(matrix[0])
        left = 0
        right = m * n - 1
        while left <= right:
            mid = (left + right) // 2
            midElement = matrix[mid // n][mid % n]
            if midElement == target:
                return True
            elif midElement < target:
                left = mid + 1
            else:
                right = mid - 1
            
        return False