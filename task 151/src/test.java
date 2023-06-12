import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            x.add(i);
        }

        x.remove(5);
        System.out.println(x);
    }
}
