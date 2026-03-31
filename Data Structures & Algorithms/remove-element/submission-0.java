class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> nonEquals = new ArrayList<>();
        for (int n: nums) {
            if (n != val) {
                nonEquals.add(n);
            }
        }
        for (int i = 0; i < nonEquals.size(); i++) {
            nums[i] = nonEquals.get(i);
        }
        return nonEquals.size();
    }
}