package ALCQueueExample3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UseQueue2 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Scanner kb=new Scanner(System.in);
        int choice;
        Integer x;
        do {
            System.out.println("Select an operation:");
            System.out.println("1.Insert\n2.Remove\n3.Peek\n4.Quit");
            choice=kb.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter insert the element:");
                    x=kb.nextInt();
                    q.add(x);
                    System.out.println("Element inserted:"+x);
                    break;
                case 2:
                    x=q.poll();
                    if(x!=null)
                        System.out.println("Element remove:"+x);
                    else
                        System.out.println("Queue Underflow");
                    break;
                case 3:
                    x=q.peek();
                    if (x!=null)
                        System.out.println("Top element:"+x);
                    else
                        System.out.println("Queue Underflow");
                    break;
                case 4:
                    System.out.println("Thankyou");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }while (choice!=4);

    }
}
