import java.util.Arrays;

public class Test {
    public static void main(String[] args)
{
    int[] array_nums = {20, 30, 40};
    System.out.println("Массив: "+ Arrays.toString(array_nums));
    int max_val = array_nums[0];
    if(array_nums[2] >= max_val)
        max_val = array_nums[2];
    System.out.println("Максимальное значение между первым и последним элементом: "+max_val);
}
}
