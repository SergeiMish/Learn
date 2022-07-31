import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateForNow = new SimpleDateFormat("y - M - d HH:mm");
        System.out.println("Сейчас " + dateForNow.format(date));
    }
}
