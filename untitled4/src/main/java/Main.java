
public class Main {
    public static void main(String[] args) {

    }
    public int calculate ( int n, int left, int right){
        int time = 0;
        while (left + 1 != right && left != 0 && right != n) {
            left -= 1;
            right += 1;
            time += 1;
        }

        return time;
    }
}

