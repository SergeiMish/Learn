public class Main {
    public static int recursiveBinarySearch(int arr[], int firstElement, int lastElement, int elementToSearch) {
        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;
            if (arr[mid] == elementToSearch)
                return mid;



