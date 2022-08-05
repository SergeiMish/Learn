public class Main {
    public static void main(String[] args) {
        int[][] numbers = new int[10][10];
        for (int i = 0; i < 10; i++) {
            numbers[i][0] = i + 1;
            numbers[0][i] = i + 1;
        }for (int x=0; x<numbers.length; x++){
            for (int y=0; y<numbers.length; y++){
                numbers [x][y] = numbers[x][0] * numbers[0][y];
            }
        }
        for (int[] table:numbers){
            for (int table2:table){
                System.out.print(table2 + " ");
            }
            System.out.println();
        }
        }
    }

