import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    int test = 0;
    Scanner in = new Scanner(System.in);
	   System.out.print("Input a positive integer: ");
    int n = in.nextInt();
       if (n < 1) {
           System.out.print(Boolean.toString(false));
        test = 1;
    }
		if ((n & (n - 1)) != 0) {
        System.out.print(Boolean.toString(false));
        test = 1;
    }
		if (test==0)
}
