import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int x = ois.readInt();
            Person[] person = new Person[x];

            for (int i = 0; i < x; i++){
                person[i] = (Person) ois.readObject();
            }
            System.out.println(Arrays.toString(person));

            ois.close();



        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
