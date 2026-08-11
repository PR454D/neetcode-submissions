class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        count = 0
        def sink(i, j):
            m, n = len(grid), len(grid[0])
            if (
                i < 0 or
                i >= m or
                j < 0 or
                j >= n or
                grid[i][j] == '0'):
                return
            
            grid[i][j] = '0'
            sink(i + 1, j)
            sink(i - 1, j)
            sink(i, j + 1)
            sink(i, j - 1)

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == '1':
                    sink(i, j)
                    count += 1
        return count
