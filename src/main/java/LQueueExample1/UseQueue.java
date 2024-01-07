package LQueueExample1;

import java.util.Scanner;

public class UseQueue {
    public static void main(String[] args) {
        Queue s = new Queue(5);
        Scanner sc = new Scanner(System.in);
        int choice, x;
        do {
            System.out.println("Select an operation:");
            System.out.println("1.Insert\n2.Remove\n3.Peek\n4.Quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter no to insert:");
                    x = sc.nextInt();
                    try {
                        s.insert(x);
                        System.out.println("Insert:" + x);
                    } catch (QueueException ex) {
                        System.out.println("Error:" + ex.getMessage());
                    }
                    break;
                case 2:
                    try {
                        x = s.remove();
                        System.out.println("Remove:" + x);
                    } catch (QueueException ex) {
                        System.out.println("Error:" + ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                        x = s.peek();
         System.out.println("Peeked:" + x);
                    } catch (QueueException ex) {
                        System.out.println("Error:" + ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Wrong choice, try again");
            }


        } while (choice != 4);


    }
}
