class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i : piles) {
            max = Math.max(i, max);
        }

        int l = 1;
        int r = max;
        int res = max;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            long total = 0;
            for (int pile: piles) {
                total += (long) Math.ceil((double) pile / mid);
            }
            if (total <= h) {
                r = mid - 1;
                res = mid;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
