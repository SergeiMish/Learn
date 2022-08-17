import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fibNaive(n, mem));
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения программы в наносекундах = " + estimatedTime);
    }

        private static long fibNaive(int n, long[] mem) {
            if (mem[n] !=-1) return mem[n];
            if (n <=1) return n;
            long result =  fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
            mem[n] = result;
            return result;
        }

    }
