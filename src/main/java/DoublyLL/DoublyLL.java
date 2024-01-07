package DoublyLL;

import java.util.NoSuchElementException;

public class DoublyLL {
    private Node head;
    public void append(int x){
        Node p=new Node(x);
        if (head==null){
            head=p;
            return;
        }
        Node temp=head;
        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.setNext(p);
        p.setPre(temp);
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        System.out.print("null<->");
        while (temp!=null){
            System.out.print(temp.getData()+"<->");
            temp=temp.getNext();
        }
        System.out.print("null");
    }
    public int removefirst(){
        if (head==null){
            throw new NoSuchElementException("List is empty");
        }
        int x=head.getData();
        head=head.getNext();
        if (head!=null){
            head.setPre(null);
        }
        return x;
    }
    public int removeLast(){
        if(head==null){
            throw new NoSuchElementException("List is empty");
        }
        int x;
        if(head.getNext()==null){
            x=head.getData();
            head=null;
            return x;
        }
        Node temp=head;
        while (temp.getNext()!=null){
            temp=temp.getNext();
        }
        x=temp.getData();
        temp.getPre().setNext(null);
        return x;
    }
}

