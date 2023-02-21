import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person("Петр",25);
        Person person2 = new Person("Мария", 22);

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
