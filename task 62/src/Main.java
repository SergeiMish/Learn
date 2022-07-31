import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new SimpleDateFormat("y-M-d H:m").get2DigitYearStart();
        System.out.println(date);
    }
}
