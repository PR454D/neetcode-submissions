class MinStack {
    private final Stack<Long> stack;
    private long min;

    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        if (this.stack.isEmpty()) {
            this.stack.push(0L);
            this.min = val;
        } else {
            stack.push((long) val - min);
            if (val < min) min = val;
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) return;
        long diff = stack.pop();
        if (diff < 0) this.min = this.min - diff;
    }
    
    public int top() {
        long diff = stack.peek();
        if (diff > 0) return (int) (this.min + diff);
        return (int) this.min;
    }
    
    public int getMin() {
        return (int) this.min;
    }
}
