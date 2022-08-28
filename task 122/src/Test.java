public class Test {
    public static void main(String[] args)
    {
        int[] array_nums = {10, 20, 10, 20, 40, 13, 20};

        int count = 0, result =0;
        if(array_nums.length >= 1 && array_nums[0] == 20)
            count++;
        for(int i = 1; i < array_nums.length; i++) {
            if(array_nums[i - 1] == 20 && array_nums[i] == 20)
            {
                System.out.printf( String.valueOf(false));
                result = 1;
    }
