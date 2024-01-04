package stacks;

public class StackLinkedList {
    private Node top;
    private Node bottom;
    private int size;

    public StackLinkedList() {
        top = null;
        bottom = null;
        size = 0;
    }

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        stackLinkedList.push(5);
        stackLinkedList.display();
        System.out.println("Pop: " + stackLinkedList.pop());
        stackLinkedList.display();
        System.out.println("Peak: " + stackLinkedList.peak());
        stackLinkedList.push(5);
        stackLinkedList.push(6);
        stackLinkedList.display();
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            bottom = newest;
        } else {
            newest.next = top;
            top = newest;
        }
        top = newest;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        Node p = top;
        top = p.next;
        size--;
        return p.element;
    }

    public int peak() {
        if (isEmpty()) {
            return -1;
        }
        return top.element;
    }

    public void display() {
        Node p = top;
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
