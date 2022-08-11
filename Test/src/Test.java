import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 101; i++){
            arrayList.add(i);

        }
        System.out.println(arrayList);
        System.out.println(arrayList.get(10));
        System.out.println(arrayList.get(100));
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
