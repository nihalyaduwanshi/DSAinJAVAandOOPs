package CQueueExample2;

import java.util.Scanner;

public class UseCQueue {
    public static void main(String[] args) {
        CQueue q=new CQueue();
        Scanner sc=new Scanner(System.in);
        int choice,x;
        do {
            System.out.println("Select an operation:");
            System.out.println("1.Insert\n2.Remove\n3.Peek\n4.Quit");
            choice =sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter value insert:");
                    x=sc.nextInt();
                    q.insert(x);
                        System.out.println("Inserted:"+x);
                    break;
                case 2:
                    try {
                        x=q.remove();
                        System.out.println("Removed:"+x);
                    }catch (CQueueException ex){
                        System.out.println("Error:"+ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                       x= q.peek();
                        System.out.println("Peeked:"+x);
                    }catch (CQueueException ex){
                        System.out.println("Error:"+ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }
        }while (choice!=4);

    }
}
