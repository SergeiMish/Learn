public class Test {
    public static void main(String[] args)
    {
        int[] array_nums = {10, 20, 10, 50, 20, 13, 50};
        //int[] array_nums = {10, 10, 50, 50, 20, 13, 50};
        boolean testd = false;
        int result = 0;
        int x = 10;

        for(int i = 0; i < array_nums.length - 1; i++) {
            if(array_nums[i] == x && array_nums[i+1] == x)
            {
                System.out.printf( String.valueOf(true));
                result = 1 ;
            }
