package Polymorphism;

public class Parent {
    public static void show(){ //Method hiding
        System.out.println("show of parent....");
    }
    public void display(){ //Method overriding
        System.out.println("In display parent..");
    }
}
