class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                return n;
            }
            map.put(n, 1);
        }

        int slow = map.get(0);
        int fast = map.get(0);
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast)
                return nums[slow];
        }
    }
}
