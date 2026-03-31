class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (indexes.containsKey(compliment)) {
                return new int[]{ indexes.get(compliment), i };
            }
            indexes.put(nums[i], i);
        }
        return new int[]{};
    }
}
