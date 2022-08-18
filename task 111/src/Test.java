import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumbOfDig(digits));
    }
    public static String maxNumbOfDig(int[] digits){
        Arrays.sort(digits);

        String result = "";

        for (int i = digits.length - 1; i >= 0; i--)
            result += digits[i];

        return result;
    }
}
