import java.util.Arrays;

public class Main {
     int[] array = {6,9,8};
System.out.println("B" + Arrays.binarySearch(array,9));
System.out.println("C" + Arrays.compare(array,
             new int[] {6, 9, 8}));
System.out.println("M" + Arrays.mismatch(array,
             new int[] {6, 9, 8}));

