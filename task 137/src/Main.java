import Interfeces.Animal;
import Interfeces.Human;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(25);
        Human human = new Human("Марго");
        animal.showInfo();
        human.showInfo();
    }
}
