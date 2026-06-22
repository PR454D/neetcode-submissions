class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> index = new HashSet<>();
        for (int n : nums) {
            if (index.contains(n))
                return n;
            index.add(n);
        }
        return -1;
    }
}
