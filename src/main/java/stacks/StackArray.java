package stacks;

public class StackArray {
    private int data[];
    private int top;

    public StackArray(int size) {
        data = new int[size];
        top = 0;
    }

    public static void main(String[] args) {
        StackArray stackArray = new StackArray(10);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.push(5);
        stackArray.display();
        System.out.println("Pop: " + stackArray.pop());
        stackArray.display();
        System.out.println("Peak: " + stackArray.peak());
        stackArray.push(5);
        stackArray.push(6);
        stackArray.display();
    }

    public int length() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    private boolean isFull() {
        return top == data.length;
    }

    public void push(int e) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        data[top] = e;
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int e = data[top-1];
        top--;
        return e;
    }

    public int peak() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return data[top-1];
    }

    public void display() {
        for (int i = 0; i < top;i++) {
            System.out.println(data[i]);
        }
        System.out.println();
    }
}
