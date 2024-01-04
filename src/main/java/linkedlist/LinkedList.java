package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertSorted(7);
        linkedList.insertSorted(4);
        linkedList.insertSorted(12);
        linkedList.insertSorted(15);
        linkedList.insertSorted(3);
        linkedList.insertSorted(1);
        //linkedList.addAtPosition(8, 4);
        linkedList.display();
        //linkedList.deleteFirst();
        //linkedList.display();
        //linkedList.removeAny(3);
        //int search = linkedList.search(8);
        //System.out.println("Index of element is: " + search);
        //linkedList.display();
    }

    private void addFirst(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            newest.next = head;
            head = newest;
        }
        size++;
    }

    private void addAtPosition(int e, int position) {
        Node newest = new Node(e, null);

        if (isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            Node p = head;
            int i = 1;
            while ((position-1) > i) {
                p = p.next;
                i++;
            }
            newest.next = p.next;
            p.next = newest;
        }
        size++;
    }

    private void addLast(int e) {
        Node newest = new Node(e, null);

        if (isEmpty())
            head = newest;
        else
            tail.next = newest;

        tail = newest;
        size++;
    }

    private int deleteFirst() {
        int e = head.element;
        head = head.next;
        size--;
        if (isEmpty())
            tail = null;
        return e;
    }

    private int removeAny(int position) {
        Node currentNode = head;
        int i = 1;
        while ((position-1) > i) {
            currentNode = currentNode.next;
            i++;
        }
        currentNode.next = currentNode.next.next;
        size--;
        return currentNode.element;
    }

    private int search(int key) {
        Node p = head;
        int i = 0;
        while (p != null) {
            if (p.element == key)
                return i;
            p = p.next;
            i++;
        }
        return -1;
    }

    private void insertSorted(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()){
            head = newest;
        } else {
            Node p = head;
            Node q = head;

            while (p != null && p.element < e) {
                q = p;
                p = p.next;
            }
            if (p == head) {
                newest.next = head;
                head = newest;
            } else {
                newest.next = q.next;
                q.next = newest;
            }

        }
        size++;
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

        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
