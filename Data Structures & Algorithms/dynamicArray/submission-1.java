class DynamicArray {
    int capacity;
    int length;
    int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        arr = new int[capacity];
    }

    public int get(int i) {
        if (i < length) return arr[i];
        return -1;
    }

    public void set(int i, int n) {
        if (i < length) {
            arr[i] = n;
            return;
        }
        return;
    }

    public void pushback(int n) {
        if (length == capacity) this.resize();
        arr[length] = n;
        length++;
    }

    public int popback() {
        if (length > 0) {
            length--;
            return arr[length];
        }
        return -1;
    }

    private void resize() {
        capacity = 2 * capacity;
        int[] newArr = new int[capacity];

        for (int i = 0; i < length; ++i) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
