public class Stack<E> {
    private int currentSize;            // size of the stack
    private Node first;                 // top of stack
    private int maxSize;                // max size of the stack

    private class Node {
        private E item;
        private Node next;
    }

    public Stack() {
        first = null;
        currentSize = 0;
        maxSize = 10;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }

    public boolean push(E item) {
        if (currentSize == maxSize) return false;
        Node tmp = first;
        first = new Node();
        first.item = item;
        first.next = tmp;
        currentSize++;
        return true;
    }

    public E pop() {
        if (isEmpty()) return null;
        E item = first.item;
        first = first.next;
        currentSize--;
        return item;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getSize () {
        return currentSize;
    }

}

