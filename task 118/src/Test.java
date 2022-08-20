import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numb1 = {1, 2, 3, 4,};
        int[] numb2 = {3, 5, 3, 55};
        int[] result = ArrayUtils.addAll(numb1, numb2);
        System.out.println(Arrays.toString(result));
    }
