package Polymorphism;

public class UseBinding {  //runtime polymorphism achieve
    public static void main(String[] args) {
        Parent p=new Parent();
        p.show();
        p.display();
        p=new Child();
        p.show();
        p.display();
    }
}
