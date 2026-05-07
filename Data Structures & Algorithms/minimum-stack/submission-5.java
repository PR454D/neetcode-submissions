class MinStack { 
    private final Stack<Long> stack;
    private long min;

    public MinStack() {
        this.stack = new Stack<Long>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            this.stack.push(0L);
            min = val;
        } else {
            this.stack.push((long) val - min);
            if (val < min) min = val;
        }
    }

    public void pop() {
        if (this.stack.isEmpty())
            return;
        long diff = this.stack.pop();
        if (diff < 0)
            min = min - diff;
    }

    public int top() {
        long top = this.stack.peek();
        if (top > 0)
            return (int) (top + min);
        else
            return (int) min;
    }

    public int getMin() {
        return (int) this.min;
    }
}