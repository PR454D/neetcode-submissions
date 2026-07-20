class MedianFinder {

    private final List<Integer> nums;
    public MedianFinder() {
        this.nums = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int index = Collections.binarySearch(this.nums, num);
        if (index < 0) index = -(index + 1);
        this.nums.add(index, num);
    }
    
    public double findMedian() {
        int mid = this.nums.size() / 2;
        if (this.nums.size() % 2 == 0) {
            return (this.nums.get(mid - 1) + (double) nums.get(mid)) / 2.0;
        } else {
            return (double) this.nums.get(mid);
        }
    }
}
