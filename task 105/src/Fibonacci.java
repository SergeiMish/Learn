public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNaive(3));
        System.out.println(fibNaive(5));
        System.out.println(fibNaive(10));
    }

        private static long fibNaive(int n){
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibNaive(n-1) + fibNaive(n - 2);


        }
    }
