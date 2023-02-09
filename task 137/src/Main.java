import Interfeces.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(25);
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
