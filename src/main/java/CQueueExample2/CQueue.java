package CQueueExample2;

import java.util.ArrayList;
import java.util.Arrays;

public class CQueue {
    private ArrayList<Integer>arr;
    private int front,rear;
    public CQueue(){
        arr=new ArrayList<>();
        front=rear=-1;
    }
    public void insert(int x){
        rear++;
        arr.add(rear,x);
        if(front==-1)
            front=0;
    }
    public int remove() {
        if (front == -1) {
            CQueueException obj = new CQueueException("Queue Underflow");
            throw obj;
        }
        int x;
        x = arr.remove(front);
        if (front == rear)
            front = rear = -1;


        return x;
    }
    public int peek(){
        if(front==-1){
            CQueueException obj = new CQueueException("Queue Underflow");
            throw obj;
        }
        int x;
        x=arr.get(front);
        return x;
    }
}
