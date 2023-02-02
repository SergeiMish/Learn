import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] number = {{1,5,6},
                           {3,8,2},
                           {4,5,1}};
        for (int[]numbers : number){
            System.out.println(Arrays.toString(numbers));
        }

    }
}