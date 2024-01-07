package DynaStack;

public class Stack {
    private int count=0;
    private Node tos;
    public void push(int x){
        Node p=new Node(x);
        if (p==null){
            throw new StackException("Stack Overflow");
        }
        p.setNext(tos);
        ++count;
        tos=p;
    }
    public int pop(){
        if (tos==null){
            throw new StackException("Stack Underflow");
        }
        int x;
        x=tos.getData();
        tos=tos.getNext();
        --count;
        return x;
    }
    public int peek(){
        if(tos==null){
            throw new StackException("Stack Underflow");
        }
        int x;
        x=tos.getData();
        return x;
    }
    public boolean isEmpty(){
        return tos==null;
    }
    public int size(){
        return count;
    }
}
