import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int[] removeElement(int[] array, int item) {
        return Arrays.stream(array)
                .filter(i -> i != item)
                .toArray();
    }
    public static void main(String[] args) {

       int [] array = {1, 2, 3, 4, 15, 17, 18, 22, 33};
       int IndexPoison = 4;
       int newValue = 7;

        System.out.println("Original array " + Arrays.toString(array));

        for (int i = array.length - 1; i > IndexPoison; i--){
            array[i] = array[i-1];}

        array[IndexPoison] = newValue;
        System.out.println("New Array " + Arrays.toString(array));

        int item = 5;
        array = removeElement(array, item);

        System.out.println("Array remove " + Arrays.toString(array));


    }
    }
