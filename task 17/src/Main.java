<<<<<<< HEAD
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (; ; )
        {
            String namePerson = scanner.nextLine();
            if (namePerson.contains(namePerson)){
                phoneBook.put(namePerson, phoneBook.get(namePerson) +1);
            } else {

            }
        }
    }
}
=======
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (; ; )
        {
            String namePerson = scanner.nextLine();
            if (namePerson.contains(namePerson)){
                phoneBook.put(namePerson, phoneBook.get(namePerson) +1);
            } else {

            }
        }
    }
}
>>>>>>> origin/main
