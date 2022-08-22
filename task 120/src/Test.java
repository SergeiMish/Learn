import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Test {
    public static void main(String[] args)
    {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = in.nextInt();
        System.out.printf("Square root of %d is: ",n);
        System.out.println(sqrt(n));