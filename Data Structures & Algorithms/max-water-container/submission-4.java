class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length; j++) {
                res = Math.max(res, Math.min(heights[i], heights[j]) * (j - i));
            }
        }
        return res;
    }
}
