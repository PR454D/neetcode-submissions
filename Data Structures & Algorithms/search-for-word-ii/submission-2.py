class Solution:
    def findWords(self, board: List[List[str]], words: List[str]) -> List[str]:
        trie = {}
        for word in words:
            node = trie
            for char in word:
                node = node.setdefault(char, {})
            node['#'] = word

        ans = []
        ROWS, COLS = len(board), len(board[0])

        def dfs(r, c, node):
            char = board[r][c]
            if char not in node:
                return
            
            next_node = node[char]
            if '#' in next_node:
                ans.append(next_node.pop('#'))

            board[r][c] = '*'
            for dr, dc in [(0, 1), (0, -1), (1, 0), (-1, 0)]:
                nr, nc = r + dr, c + dc
                if 0 <= nr < ROWS and 0 <= nc < COLS and board[nr][nc] != '*':
                    dfs(nr, nc, next_node)
            board[r][c] = char
            
            if not next_node:
                node.pop(char)

        for r in range(ROWS):
            for c in range(COLS):
                dfs(r, c, trie)
        return ans