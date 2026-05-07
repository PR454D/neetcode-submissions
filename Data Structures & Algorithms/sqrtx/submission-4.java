class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int res = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long sqr = (long) mid * mid;
            if (sqr == x) {
                return mid;
            } else if (sqr < x) {
                l = mid + 1;
                res = mid;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}