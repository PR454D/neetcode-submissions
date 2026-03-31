class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int compliment = target - num;
            if (index.containsKey(compliment)) {
                return new int[] { index.get(compliment), i };
            }
            index.put(num, i);
        }
        return new int[0];
    }
}
