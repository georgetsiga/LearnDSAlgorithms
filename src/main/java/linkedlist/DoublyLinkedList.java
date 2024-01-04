package linkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFirst(4);
        doublyLinkedList.addFirst(3);
        doublyLinkedList.addFirst(2);
        doublyLinkedList.addFirst(1);
        doublyLinkedList.addLast(5);
        doublyLinkedList.addLast(7);
        doublyLinkedList.addAtPosition(6, 6);
        doublyLinkedList.display();
        doublyLinkedList.removeAny(3);
        doublyLinkedList.display();
    }

    private void addFirst(int e) {
        Node newest = new Node(e, null, null);
        if (isEmpty()) {
            tail = newest;
        } else {
            newest.next = head;
            head.previous = newest;
        }
        head = newest;
        size++;
    }

    private void addLast(int e) {
        Node newest = new Node(e, null, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.next = newest;
            newest.previous = tail;
        }
        tail = newest;

        size++;
    }

    private void addAtPosition(int e, int position) {
        Node newest = new Node(e, null, null);
        if (isEmpty()) {
            head = newest;
            tail = newest;
        }

        Node p = head;
        int i = 1;
        while (i < (position - 1)) {
            p = p.next;
            i++;
        }
        newest.next = p.next;
        p.next.previous = newest;
        p.next = newest;
        newest.previous = p;
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Doubly List is Empty");
            return -1;
        }
        int e = head.element;
        head = head.next;
        size = size - 1;
        if (isEmpty())
            tail = null;
        else
            head.previous = null;
        return e;
    }

    public int removeLast() {
        if (isEmpty()) {
            return -1;
        }
        int e = tail.element;
        tail = tail.previous;
        tail.next = null;
        size--;

        return e;
    }

    public int removeAny(int position) {
        if (isEmpty()) {
            return -1;
        }
        Node p = head;
        int i = 1;
        while ((position - 1) > i) {
            p = p.next;
            i++;
        }
        int e = p.next.element;
        p.next = p.next.next;
        p.next.previous = p;
        size--;
        return e;

    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        Node p = head;
        while (p != null) {
            System.out.println(p.element);
            p = p.next;
        }
        System.out.println();
    }

    static class Node {
        private int element;
        private Node next;
        private Node previous;

        public Node(int element, Node next, Node previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
}
