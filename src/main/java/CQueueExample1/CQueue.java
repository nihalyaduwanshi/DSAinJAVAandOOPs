package CQueueExample1;


public class CQueue {
    private int arr[];
    private int rear,front;
    private int size;
    public CQueue(int size){
        this.size=size;
        front=rear=-1;
        arr=new int[size];
    }
    public void insert(int x){
        if ((rear+1)%size==front){  //replace if -//(rear==size-1 && front==0 || rear+1==front)
            CQueueException obj=new CQueueException("Queue Overflow");
            throw obj;
        }
        if (rear==size-1)
            rear=0;
        else
            rear++;
        //replace if else bali line - //rear=(rear+1)%size;
        arr[rear]=x;
        if (front==-1)
            front=0;
    }
    public int remove(){
        if (front==-1){
            CQueueException obj =new CQueueException("Queue Underflow");
            throw obj;
        }
        int x;
        x=arr[front];
        if (front==rear)
            front=rear=-1;
        else if (front==size-1)
           front=0;
        else
        front++;
        return x;
    }
    public int peek(){
        if(front==-1){
            CQueueException obj=new CQueueException("Queue Underflow");
             throw obj;
        }
        int x;
        x=arr[front];
        return x;
    }
}
