import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animal1 = new ArrayList<>();
        animal1.add(new Animal(2));
        animal1.add(new Animal(5));
        test(animal1);
        List<Dog> dog1 = new ArrayList<>();
        dog1.add(new Dog());
        test(dog1);

    }
    public static void test(List<? extends Animal>animals){
        for (Animal ani: animals){
            ani.eat();
        }
    }
}
