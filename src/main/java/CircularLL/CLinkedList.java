package CircularLL;

import java.util.NoSuchElementException;

public class CLinkedList {
    private Node head;

    public void append(int x) {
        Node p = new Node(x);
        if (head == null) {
            head = p;
            p.setNext(p);
            return;
        }
        Node temp = head;
        while (temp.getNext() != head) {
            temp = temp.getNext();
        }
        temp.setNext(p);
        p.setNext(head);
    }

    public void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        } while (temp != head);
        System.out.println("\b\b ");
    }

    public void prepend(int x) {
        Node p = new Node(x);
        if (head == null) {
            head = p;
            p.setNext(p);
            return;
        }
        Node temp = head;
        while (temp.getNext() != head) {
            temp = temp.getNext();
        }
        temp.setNext(p);
        p.setNext(head);
        head = p;
    }

    public int delfirst() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        int x;
        if (head == head.getNext()) {
            x = head.getData();
            head = null;
            return x;
        }
        Node temp = head;
        while (temp.getNext() != head) {
            temp = temp.getNext();
        }
        x = head.getData();
        head = head.getNext();
        temp.setNext(head);
        return x;
    }

    public int dellast() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        int x;
        if (head == head.getNext()) {
            x = head.getData();
            head = null;
            return x;
        }
        Node temp = head, prev = null;
        while (temp.getNext() != head) {
            prev = temp;
            temp = temp.getNext();
        }
        x = temp.getData();
        prev.setNext(null);
        temp = null;
        return x;
    }
    public boolean remove(int x){
        if (head==null){
            return false;
        }
        if (x==head.getData()){
            if (head.getNext()==head){
                head=null;
                return true;
            }
            Node temp=head;
            while (temp.getNext()!=head){
                temp=temp.getNext();
            }
            head=head.getNext();
            temp.setNext(head);
        }
        Node temp=head,prev=null;
        while (temp.getNext()!=head && temp.getData()!=x){
            prev=temp;
            temp=temp.getNext();
        }
        if (temp.getData()==x){
            prev.setNext(temp.getNext());
            temp=null;
            return true;
        }
        return false;
    }
}