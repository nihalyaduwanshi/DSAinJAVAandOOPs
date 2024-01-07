package LinkedList.LLExample2;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.printList();
        System.out.println("Total node:"+list.size());
        list.prepend(10);
        list.prepend(20);
        list.prepend(30);
        list.prepend(40);
        list.printList();
        System.out.println("Total node:"+list.size());

    }
}
