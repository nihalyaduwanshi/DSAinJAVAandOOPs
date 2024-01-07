package ALCQueueExample3;



import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class UseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner kb = new Scanner(System.in);
        int choice, x;
        do {
            System.out.println("Select an operation:");
            System.out.println("1.Insert\n2.Remove\n3.Peek\n4.Quit");
            choice=kb.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the value");
                    x=kb.nextInt();
                    q.add(x);
                    System.out.println("Element added:"+x);
                    break;
                case 2:
                    try {
                        x=q.remove();
                        System.out.println("Element remove:"+x);
                    }catch (NoSuchElementException ex){
                        System.out.println("Queue Underfloew");
                    }
                    break;
                case 3:
                    try {
                       x= q.element();
                        System.out.println("Top element:"+x);
                    }catch (NoSuchElementException ex){
                        System.out.println("Queue Underflow");
                    }
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

