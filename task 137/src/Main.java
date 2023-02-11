import Interfeces.Animal;
import Interfeces.Human;
import Interfeces.Info;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(25);
        Human human = new Human("Марго");
        animal.showInfo();
        human.showInfo();
        outPutInfo(animal);
        outPutInfo(human);
    }
    public static void outPutInfo(Info info){
        info.showInfo();
    }
}
