import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
    public static void main(String[] args) {
        Person person1 = new Person(5,"Том");
        Person person2 = new Person(8,"Стивен");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
