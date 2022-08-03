import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Frog");
        String animal = (String) animals.get(2);
        System.out.println(animal);
        List<String> animals2 = new ArrayList<>();
        animals2.add("Морж");


    }
}
