import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] num1 = {5, 3, 34, -2,};
        int [] num2 = {-3, 4, 5, 10};
        int [] summ = new int[4];
        summ[0] = num1[0] * num2[0];
        summ[1] = num1[1] * num2[1];
        summ[2] = num1[2] * num2[2];
        summ[3] = num1[3] * num2[3];
        System.out.println(Arrays.toString(summ));
    }
}
