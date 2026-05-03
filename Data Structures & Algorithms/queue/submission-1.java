class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
        Node next = null;
        Node prev = null;
    }
}

class Deque {
    private Node head;
    private Node tail;

    public Deque() {
        this.head = new Node(0);
        this.tail = new Node(0);

        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public boolean isEmpty() {
        return this.head.next == this.tail;
    }

    public void append(int value) {
       Node demo = new Node(value);
       Node lastNode = this.tail.prev;
       lastNode.next = demo;
       demo.prev = lastNode;
       demo.next = this.tail;
       this.tail.prev = demo;
    }

    public void appendleft(int value) {
        Node demo = new Node(value);
        Node firstNode = this.head.next;

        this.head.next = demo;
        demo.prev = this.head;
        demo.next = firstNode;
        firstNode.prev = demo;
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
        Node targetNode = this.tail.prev;
        int value = targetNode.value;
        Node prevNode = targetNode.prev;

        prevNode.next = this.tail;
        this.tail.prev = prevNode;
        return value;
    }

    public int popleft() {
        if (this.isEmpty()) {
            return -1;
        }
        Node targetNode = this.head.next;
        int value = targetNode.value;
        Node nextNode = targetNode.next;

        nextNode.prev = this.head;
        this.head.next = nextNode;
        return value;
    }
}
