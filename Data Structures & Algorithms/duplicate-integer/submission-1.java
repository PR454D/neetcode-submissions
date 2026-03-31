class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> index = new HashSet<>();
        for (int i = 0; i< nums.length; ++i){
            if (index.contains(nums[i])) {
                return true;
            }
            index.add(nums[i]);
        }
        return false;
    }
}
