public class Test {
    public static void main(String[] arg)
    {
        String str ="abcdef";
        char[] A = str.toCharArray();
        int offset=3;
        int len = A.length;
        offset %= len;
        reverse(A, 0, len - offset - 1);
}
