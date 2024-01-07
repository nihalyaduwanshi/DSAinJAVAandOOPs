package Interface;

public class Lion implements Animal{

    @Override
    public void makeSound() {
        System.out.println("A Lion Roars");
    }

    @Override
    public void eat() {
        System.out.println("A lion eats flesh");
    }
}
