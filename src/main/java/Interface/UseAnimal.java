package Interface;

public class UseAnimal {
    public static void main(String[] args) {
        Animal animal;

        animal=new Elephant();

        animal.makeSound();
        animal.eat();

        animal=new Lion();

        animal.makeSound();
        animal.eat();


    }
}
