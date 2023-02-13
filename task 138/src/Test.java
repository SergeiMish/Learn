import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal(24));
        animals.add(new Animal(44));
        test(animals);
    }

    private static void test(List<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}