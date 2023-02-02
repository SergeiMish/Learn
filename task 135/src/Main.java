import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         double x = Math.random();
         int k = (int) Math.round(x * 10);
         int [][] nubmers = new int[10][10];
        nubmers[k][k] = nubmers[k][0] * nubmers[0][k];
         for (int i = 0; i<nubmers.length; i++){
             for (int j = 0; j < nubmers.length; i++){
                 System.out.print(nubmers[i][j] + " ");
             }
         }
    }
}