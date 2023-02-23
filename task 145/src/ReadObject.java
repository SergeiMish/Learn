import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            Person person1 = (Person) ois.readObject();
            System.out.println(person1);



        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
