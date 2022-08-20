import java.util.Arrays;

public class Test{
    public static void main(String[] args) {
    }

    public int[] arr(){
        int[] number1  = {1, 2, 3, 4};
        int[] number2 = {2, 5, 7, 8};
        int[] result = Arrays.copyOf(number1, number1.length + number2.length);
        System.arraycopy(number2, 0, result, number1.length, number2.length);
        return result;
        System.out.println(Arrays.toString(result[]));
    }
}
