
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[]table = {1,2,4,5,6,7,9,};
        int index = Integer.MAX_VALUE;
        int low = table[0];
        int high = table.length;
        int key = 5;
        while (low <= high){
            int mid = low + ((high - low)/2);
            if (table[mid] < key) {
                low = mid + 1;
            }else if (table[mid] > key){
                high = mid - 1;
            }else  if (table[mid] == key){
            }index = mid;
        }
        System.out.println(index);
        }

}
