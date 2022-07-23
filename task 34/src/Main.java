public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];
        int x;
        int y;
        for (int i = 0; i < 10; i++) {
            numbers[0][i] = i +1;
            numbers[i][0] = i +1;
                    }for (x=0; x<numbers.length; x++){
            for (y=0; y<numbers.length; y++)
                numbers [x][y]= numbers[0][x]*numbers[y][0];
        }

        {for (int[] table : numbers) {
            for (int table2 : table) {
                System.out.print(table2 + " ");
        }
        System.out.println();
    }}}}