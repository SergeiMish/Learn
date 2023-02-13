import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List list = new  ArrayList();
        list.add("Собака");
        list.add("Не собака");
        list.add("Рыбка");

        String animal = list.get(1);
    }
}
