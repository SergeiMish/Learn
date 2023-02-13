import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(24));
        animals.add(new Animal(44));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        test(animals);
        test(dogs);

    }

    private static void test(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}