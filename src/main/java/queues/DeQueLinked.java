package queues;

public class DeQueLinked {
    private Node front;
    private Node rear;
    private int size;

    public DeQueLinked() {
        front = null;
        rear = null;
        size = 0;
    }

    public static void main(String[] args) {
        DeQueLinked deQueLinked = new DeQueLinked();
        deQueLinked.addFirst(5);
        deQueLinked.addFirst(3);
        deQueLinked.addLast(7);
        deQueLinked.addLast(12);
        deQueLinked.display();
        System.out.println("Size: " + deQueLinked.length());
        System.out.println("Front Element Removed: " + deQueLinked.removeFirst());
        System.out.println("Rear Element Removed: " + deQueLinked.removeLast());
        deQueLinked.display();
        System.out.println("First Element: " + deQueLinked.first());
        System.out.println("Last Element: " + deQueLinked.last());

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
            rear = newest;
        } else {
            newest.next = front;
        }
        front = newest;
        size++;
    }

    private void addLast(int e) {
        Node newest = new Node(e, null);

        if (isEmpty())
            front = newest;
        else
            rear.next = newest;

        rear = newest;
        size++;
    }

    private int removeFirst() {
        int e = front.element;
        front = front.next;
        size--;
        if (isEmpty())
            rear = null;
        return e;
    }

    public int removeLast() {
        if(isEmpty()) {
            System.out.println("List is Empty");
            return -1;
        }
        Node p = front;
        int i = 1;
        while(i < size-1 ) {
            p = p.next;
            i = i + 1;
        }
        rear = p;
        p = p.next;
        int e = p.element;
        rear.next = null;
        size = size - 1;
        return e;
    }

    public int first() {
        if(isEmpty()) {
            System.out.println("DeQue is Empty");
            return -1;
        }
        return front.element;
    }

    public int last() {
        if(isEmpty()) {
            System.out.println("DeQue is Empty");
            return -1;
        }
        return rear.element;
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
