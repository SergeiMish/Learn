import java.util.Arrays;

public class Test {
        public static void main(String[] args)
        {
            int[] array_nums = {20, 30, 40};
            System.out.println("Оригинальный массив: "+ Arrays.toString(array_nums));
            int[] new_array_nums = {array_nums[1], array_nums[2], array_nums[0]};
            System.out.println("Перевернутый массив: "+Arrays.toString(new_array_nums));
        }
    }

