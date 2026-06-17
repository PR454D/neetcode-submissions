class Solution {
    List<List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        backtrack(nums, target, current, 0, 0);
        return result;
    }

    private void backtrack(int[] nums, int target, List<Integer> current,int i, int total) {
        if (total == target) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int j = i; j < nums.length; j++) {
            if (total + nums[j] > target) return;
            
            current.add(nums[j]);
            backtrack(nums, target, current, j, total + nums[j]);
            current.removeLast();
        }
    }
}
