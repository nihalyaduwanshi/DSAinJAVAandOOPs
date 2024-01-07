package LinkedList.LLExample2;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node head;

    public void addAtLast(int x){
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

    }
    public void printList(){
        if(head==null){
            System.out.println("List is Empty.");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }
    public int size(){
        int count=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.getNext();
            count++;
        }
        return count;
    }
    public int search(int x){
        if (head==null){
            return 0;
        }
        int pos=0;
        Node temp=head;
        while (temp!=null){
            pos++;
            if(temp.getData()==x){
                return pos;
            }
            temp=temp.getNext();
        }
        return -1;
    }
    public void prepend(int x){
        Node p=new Node(x);
        p.setNext(head);
        head=p;
    }
    public void addAtPos(int x,int pos){
        if(pos>size() || pos<0){
            throw new IndexOutOfBoundsException("Invalid pos");
        }
        if(pos==0){
            prepend(x);
            return;
        }
        Node p=new Node(x);
        int count=0;
        Node temp=head;
        while (count<pos-1){
            count++;
            temp=temp.getNext();
        }
        p.setNext(temp.getNext());
        temp.setNext(p);
    }
    public int removeFirst(){
        if (head==null){
            throw new NoSuchElementException("List is Empty.");
        }
        int x;
        x=head.getData();
        head=head.getNext();
        return x;
    }
    public int removeLast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty.");
        }
        int x;
        if (head.getNext()==null){
            x=head.getData();
            head=null;
            return x;
        }
        Node temp,prev=null;
        temp=head;
        while (temp.getNext()!=null){
            prev=temp;
            temp=temp.getNext();
        }
        x=temp.getData();
        prev.setNext(null);
        temp=null;
        return x;
    }
    public boolean remove(int x){
        if(head==null){
            return false;
        }
        if (x==head.getData()){
            head=head.getNext();
            return true;
        }
        Node temp=head;
        Node prev=null;
        while (temp!=null){
            if(x==temp.getData()){
                break;
            }
            prev=temp;
            temp=temp.getNext();
        }
        if(temp==null){
            return false;
        }
        prev.setNext(temp.getNext());
        temp=null;
        return true;
    }
    public void reverse(){
        if(head==null || head.getNext()==null){
            return;
        }
        Node prev=null;
        Node curr=head;
        Node next;
        while (curr!=null){
            next=curr.getNext();
            curr.setNext(prev);
            prev=curr;
            curr=next;
        }
        head=prev;
    }

}
