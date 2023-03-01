public class Main {
    public static void main(String[] args) {

        int[][] table = new int[10][10];

        for (int i = 0; i < 10; i++){
            int j= i++;
            table [i][j] = table[i][j] * table[j][i];

        }
        for (int[] numbers: table){
            for (int elem : numbers) System.out.println(elem);
        }
    }
}
