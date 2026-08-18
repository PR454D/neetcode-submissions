class Solution {

  public int findMin(int[] nums) {
    int n = nums.length;
    int min = Integer.MAX_VALUE;
    int l = 0;
    int r = n - 1;
    while (l <= r) {
      int mid = l + (r - l) / 2;
      if (nums[mid] < min) {
        min = nums[mid];
      }
      if (nums[mid] >= nums[l] && nums[mid] > nums[r]) {
        l = mid + 1;
      } else {
        r = mid - 1;
      }
    }
    return min;
  }


}
