class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 0; int r = num;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long sqr = (long) mid * mid;
            if (sqr == (long) num) {
                return true;
            } else if (sqr < (long) num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}