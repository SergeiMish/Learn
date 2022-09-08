public class Test {
    public static void main(String[] args) {

    }

    public static int binarySearch (int[] a, int key) {
        int low = 0;
        int high = a.length -1;
        while (low <= high){
            int middle = low + (high - low) / 2;

            if (key < middle) {
                high = middle - 1;
            } else if (key > middle) {
                low = middle + 1;
            }
            else{
                return middle;
            }
        }
        }

    }
}
