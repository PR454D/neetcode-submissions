class Deque {
    private final List<Integer> queue;

    public Deque() {
        this.queue = new LinkedList<>();
    }

    public boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public void append(int value) {
       this.queue.addLast(value);
    }

    public void appendleft(int value) {
        this.queue.addFirst(value);
    }

    public int pop() {
        if (this.queue.isEmpty()) {
            return -1;
        }
        return this.queue.removeLast();
    }

    public int popleft() {
        if (this.queue.isEmpty()) {
            return -1;
        }
        return this.queue.removeFirst();
    }
}
