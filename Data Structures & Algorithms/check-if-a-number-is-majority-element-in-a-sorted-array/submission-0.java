class Solution {
    private int lowerBound(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int idx = nums.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                r = mid - 1;
                idx = mid;
            } else {
                l = mid + 1;
            }
        }
        return idx;
    }

    public boolean isMajorityElement(int[] nums, int target) {
        int firstIdx = lowerBound(nums, target);
        return (firstIdx + nums.length / 2 < nums.length) && nums[firstIdx + nums.length / 2] == target;
    }
}
