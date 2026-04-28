class Solution {
    public int coinChange(int[] coins, int amount) {
        Map<Integer, Integer> memo = new HashMap<>();
        int minCoins = dfs(amount, memo, coins);

        if (minCoins >= (int) 1e9) {
            return -1;
        }
        return minCoins;
    }

    private int dfs(int amount, Map<Integer, Integer> memo, int[] coins) {
        if (amount == 0) {
            return 0;
        }
        if (memo.containsKey(amount)) {
            return memo.get(amount);
        }
        int res = (int) 1e9;
        for (int coin: coins) {
            if (amount - coin >= 0) {
                res = Math.min(res, 1 + dfs(amount - coin, memo, coins));
            }
            memo.put(amount, res);
        }
        return res;
    }
}
