public class Main {
    public static int bruteForce(double[] array, double key) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == key)
            return i;
    }
    return -1;
}

    /*
        Двоичный поиск
     */
    public static int binarySearchRecursively(double[] sortedArray, double key) {
        return binarySearchRecursively(sortedArray, key, 0, sortedArray.length);
    }
}
