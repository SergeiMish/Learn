<<<<<<< HEAD
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) {
        int day = 27;
        int month = 8;
        int year = 1989;


        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month -1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.YEAR, year);
        Calendar date = Calendar.getInstance();
        if(calendar.after(date)) {
            System.out.println("Введенная дата не наступила!");
        } else {
            while(calendar.before(date)) {
                System.out.println(dateFormat.format(calendar.getTime()));
                calendar.add(Calendar.YEAR, 1);



    }}}}

=======
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Main {
    public static void main(String[] args) {
        int day = 27;
        int month = 8;
        int year = 1989;


        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - EEEE");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month -1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.YEAR, year);
        Calendar date = Calendar.getInstance();
        if(calendar.after(date)) {
            System.out.println("Введенная дата не наступила!");
        } else {
            while(calendar.before(date)) {
                System.out.println(dateFormat.format(calendar.getTime()));
                calendar.add(Calendar.YEAR, 1);



    }}}}

>>>>>>> origin/main
