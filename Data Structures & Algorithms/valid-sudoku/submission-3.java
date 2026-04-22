class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char itm = board[row][i];
                if (itm == '.') continue;
                if (seen.contains(itm)) return false;
                seen.add(itm);
            }
        }
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char itm = board[i][col];
                if (itm == '.') continue;
                if (seen.contains(itm)) return false;
                seen.add(itm);
            }
        }
        for (int sqr = 0; sqr < 9; sqr++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (sqr / 3) * 3 + i;
                    int col = (sqr % 3) * 3 + j;
                    char itm = board[row][col];
                    if (itm == '.') continue;
                    if (seen.contains(itm)) return false;
                    seen.add(itm);
                }
            }
        }
        return true;        
    }
}
