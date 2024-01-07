package DynaQueue;

public class Queue {
    private Node front ,rear;
    private int count;
    public void insert(int n){
        Node p=new Node(n);
        if (front==null){
            front=p;
        }
        else {
            rear.setNext(p);
        }
        rear=p;
        ++count;
    }
    public int delete(){
        if (front==null){
            System.out.println("Queue is empty");
        }
        int x=front.getData();
        front=front.getNext();
        if(front==null){
         rear=null;
        }
        --count;
        return x;
    }
    public int peek(){
        if(front==null){
            throw new QueueException("Empty Queue");
        }
        int x=front.getData();
        return x;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public int size(){
        return count;
    }
}
