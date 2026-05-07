class Solution {
    public int arrangeCoins(int n) {
        int l = 0;
        int r = n;
        int res = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long sumK = (long) mid * (mid + 1) / 2;
            if (sumK > n) {
                r = mid - 1;
            } else {
                l = mid + 1;
                res = Math.max(res, mid);
            }
        }
        return res;
    }
}