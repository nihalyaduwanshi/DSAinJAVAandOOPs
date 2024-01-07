package Interface;

public class Elephant implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Elephant make Trumpet..");
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats grasses and leaves...");
    }
}
