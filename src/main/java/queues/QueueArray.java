package queues;

public class QueueArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueArray(int n) {
        data = new int[n];
        size = 0;
        front = 0;
        rear = 0;
    }

    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(10);
        queueArray.enqueue(1);
        queueArray.enqueue(2);
        queueArray.enqueue(3);
        queueArray.enqueue(4);
        queueArray.enqueue(5);
        queueArray.display();
        System.out.println("Dequeue: " + queueArray.dequeue());
        queueArray.display();
        queueArray.enqueue(6);
        queueArray.enqueue(7);
        queueArray.display();
        System.out.println("Dequeue: " + queueArray.dequeue());
        queueArray.display();
        System.out.println("Dequeue: " + queueArray.dequeue());
    }

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void enqueue(int e) {
        if (isFull()) {
            return;
        }
        data[rear] = e;
        rear++;
        size++;
    }

    public int dequeue() {
        if(isEmpty()) {
            return -1;
        }
        int e = data[front];
        front++;
        size--;
        return e;
    }

    private void display() {
        for (int i = front; i < rear;i++) {
            System.out.println(data[i]);
        }
        System.out.println();
    }
}
