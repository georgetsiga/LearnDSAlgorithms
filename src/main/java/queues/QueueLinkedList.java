package queues;

public class QueueLinkedList {
    private Node front;
    private Node rear;
    private int size;
    
    public QueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    public static void main(String[] args) {
        QueueLinkedList queueLinkedList = new QueueLinkedList();
        queueLinkedList.enqueue(1);
        queueLinkedList.enqueue(2);
        queueLinkedList.enqueue(3);
        queueLinkedList.enqueue(4);
        queueLinkedList.enqueue(5);
        queueLinkedList.display();
        System.out.println("Dequeue: " + queueLinkedList.dequeue());
        queueLinkedList.display();
        queueLinkedList.enqueue(6);
        queueLinkedList.enqueue(7);
        queueLinkedList.display();
        System.out.println("Dequeue: " + queueLinkedList.dequeue());
        queueLinkedList.display();
        System.out.println("Dequeue: " + queueLinkedList.dequeue());
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public void enqueue(int e) {
        Node newest = new Node(e, null);
        if (isEmpty()) {
            front = newest;
        } else {
            rear.next = newest;
        }
        rear = newest;
        size++;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int e = front.element;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return e;
    }
    
    public void display() {
        Node p = front;
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
