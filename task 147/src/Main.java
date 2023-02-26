import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            arrayList.add(i);

            System.out.println(arrayList.toString());
        }
    }
}
