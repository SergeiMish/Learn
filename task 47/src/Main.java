public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];
        int x;
        int y;
        for (int i=0; i<10; i++) {
            numbers[0][i] = i + 1;
            numbers[i][0] = i + 1;
            numbers[i][i] = i * i;
        for (x=1; x<10; x++){
            y=1;
            y++;
            numbers[i][i] = numbers[x][i]*numbers[y][i];
            for (y=1; y<10; y++){
                numbers[i][i] = numbers[i][y] + numbers[i][x];
            }
        } for (int[] table: numbers){
            for (int table2: table){
            System.out.print(table2 + " ");
        }
            System.out.println();
        }
    }}}

