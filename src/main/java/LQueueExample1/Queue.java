package LQueueExample1;

public class Queue {
    private int arr[];
    private int front, rear;
    private int size;

    public Queue(int size) {
        arr = new int[size];
        front = 0;
        rear = -1;
        this.size = size;
    }

    public void insert(int x) {
        if (rear == size - 1) {
            QueueException obj = new QueueException("Queue Overflow");
            throw obj;
        }
        rear++;
        arr[rear] = x;
    }

    public int remove() {
        if (front > rear) {
            QueueException obj = new QueueException("Queue Underflow");
            throw obj;
        }
        int x = arr[front];
        front++;
        return x;
    }

    public int peek() {
        if (front > rear) {
            QueueException obj = new QueueException("Queue Underflow");
            throw obj;
        }
        int x = arr[front];
        return x;
    }
}