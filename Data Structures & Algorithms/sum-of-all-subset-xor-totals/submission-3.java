class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        for (int n: nums) {
            sum |= n;
        }
        return sum << (nums.length - 1);
    }
    // private int dfs(int[] nums, int sum) {
    //     if (nums.length <= 1) {
    //         return nums[0];
    //     }
    // }
}