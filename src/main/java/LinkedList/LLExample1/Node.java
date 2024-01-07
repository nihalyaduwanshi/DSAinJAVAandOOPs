package LinkedList.LLExample1;

public class Node {
    int data;
    Node next;
}
 class UseNode{
     public static void main(String[] args) {
         Node first=new Node();
         first.data=10;
         Node second=new Node();
         second.data=20;
         first.next=second;
         Node third=new Node();
         third.data=30;
         second.next=third;
         Node temp=first;
         while (temp!=null){
             System.out.println(temp.data);
             temp=temp.next;
         }
     }
 }
