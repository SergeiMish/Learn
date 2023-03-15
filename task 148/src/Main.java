
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[]table = {1,2,4,5,6,7,9,};
        public int runBinarySearchRecursively(
        int[] sortedArray, int key, int low, int high) {
            int middle = low  + ((high - low) / 2);

            if (high < low) {
                return -1;
            }

            if (key == sortedArray[middle]) {
                return middle;
    }
}
