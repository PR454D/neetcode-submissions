class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // always remember edge cases
        if (k == nums.length) {
            return nums;
        }
        Map<Integer, Integer> occurs = new HashMap<>();
        int[] result = new int[k];
        for (int i = 0; i < nums.length; ++i) {
            occurs.put(nums[i], occurs.getOrDefault(nums[i],0) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> occurs.get(a) - occurs.get(b)
        );
        occurs.keySet().forEach(key -> {
            heap.add(key);
            if (heap.size() > k) {
                heap.poll();
            }
        });
        int[] ans = new int[k];
        for (int i = 0; i <k; ++i) {
            ans[i] = heap.poll();
        }
        return ans;
    }
    
}
