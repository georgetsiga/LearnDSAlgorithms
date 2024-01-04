package linkedlist;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.addLast(3);
        circularLinkedList.addLast(4);
        circularLinkedList.addLast(7);
        circularLinkedList.addLast(9);
        circularLinkedList.addFirst(10);
        circularLinkedList.display();
        circularLinkedList.addAtPosition(15, 4);
        circularLinkedList.display();
        int i = circularLinkedList.deleteAny(4);
        System.out.println("Deleted: " + i);
        circularLinkedList.display();
        /*int i = circularLinkedList.deleteFirst();
        System.out.println("Deleted: " + i);
        circularLinkedList.display();
        int l = circularLinkedList.deleteLast();
        System.out.println("Deleted: " + l);
        circularLinkedList.display();*/
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void addFirst(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            newest.next = newest;
            head = newest;
            tail = newest;
        } else {
            tail.next = newest;
            newest.next = head;
            head = newest;
        }
        size++;
    }

    private void addAtPosition(int e, int position) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            newest.next = newest;
            head = newest;
        } else {
            if (position < length()) {
                Node p = head;
                int i = 1;
                while ((position - i) > 1) {
                    p = p.next;
                    i++;
                }
                newest.next = p.next;
                p.next = newest;
            }
        }
        size++;
    }

    private void addLast(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            newest.next = newest;
            head = newest;
        } else {
            newest.next = tail.next;
            tail.next = newest;
        }
        tail = newest;
        size++;
    }

    private int deleteFirst() {
        if (isEmpty()) {
            return 0;
        }
        Node p = head.next;
        int e = head.element;
        tail.next = p;
        head = p;
        size--;
        if (isEmpty()) {
            head = null;
            tail = null;
        }
        return e;
    }

    private int deleteLast() {
        if (isEmpty()) {
            return 0;
        }
        Node p = head;
        int e = tail.element;
        int i = 1;
        while ((i + 1) < length()) {
            p = p.next;
            i++;
        }
        p.next = tail.next;
        tail = p;
        size--;
        if (isEmpty()) {
            head = null;
            tail  = null;
        }
        return e;
    }

    private int deleteAny(int position) {
        if (isEmpty()) {
            return 0;
        }
        Node p = head;
        int i = 1;
        while ((position - i) > 1) {
            p = p.next;
            i++;
        }
        int e = p.next.element;
        p.next = p.next.next;
        size--;
        if (isEmpty()) {
            head = null;
            tail = null;
        }
        return e;
    }

    public void display() {
        Node p = head;
        int i = 0;
        while (i < length()) {
            System.out.println(p.element);
            p = p.next;
            i++;
        }
        System.out.println();
    }

    static class Node {
        private int element;
        private Node next;

        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
