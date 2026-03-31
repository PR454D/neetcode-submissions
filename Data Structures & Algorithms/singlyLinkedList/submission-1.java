class Node {
    int value;
    Node next;

    public Node(int value) {
        this(value, null);
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = new Node(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        Node curr = this.head.next;
        int i = 0;
        while (curr != null) {
            if (i == index) {
                return curr.value;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int value) {
        Node node = new Node(value);
        node.next = head.next;
        head.next = node;
        if (node.next == null) {// if existing list was empty
            tail = node;
        }
    }

    public void insertTail(int value) {
        this.tail.next = new Node(value);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        Node curr = this.head;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }
        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node curr = this.head.next;
        while (curr != null) {
            result.add(curr.value);
            curr = curr.next;
        }
        return result;
    }
}
