package stackexample4;

import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack();
        Scanner kb=new Scanner(System.in);
        int choice,x;
        do {
            System.out.println("Select an operation:");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Quit");
            choice=kb.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter number to push:");
                    x=kb.nextInt();
                    try {
                        s.push(x);
                        System.out.println("Pushed:"+x);
                    }catch (StackException ex){
                        System.out.println("Error:"+ex.getMessage());
                    }
                    break;
                case 2:
                    try {
                        x=s.pop();
                        System.out.println("Popped:"+x);
                    }catch (StackException ex){
                        System.out.println("Error:"+ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                        x=s.peek();
                        System.out.println("Peeked:"+x);
                    }catch (StackException ex){
                        System.out.println("Error:"+ex.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Thankyou");
                    break;
                default:
                    System.out.println("Wrong choice. Try again");
            }
        }while (choice!=4);
    }
}
