import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        int [] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumbOfDig(digits));
    }
    public static String maxNumbOfDig(int[] digits){
                 return String.join("", Arrays.stream(digits).boxed()
                         .sorted(Comparator.reverseOrder())
                       .map(String::valueOf)
                       .toArray(String[]::new));

//        Arrays.sort(digits);
//
//        String result = "";
//
//        for (int i = digits.length - 1; i >= 0; i--)
//            result += digits[i];
//
//        return result;
    }
}
