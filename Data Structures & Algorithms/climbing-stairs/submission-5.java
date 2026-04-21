class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer>  memo = new HashMap<>();
        return dfs(0, n, memo);
    }

    public int dfs(int i, int n, Map<Integer, Integer> memo) {
        if (i == n) {
            return 1;
        }
        if (i > n) {
            return 0;
        }
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        memo.put(i, dfs(i + 1, n, memo) + dfs(i + 2, n, memo));
        return memo.get(i);
    }
}
