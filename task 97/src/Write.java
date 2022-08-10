import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {
    public static void main(String[] args) {
        Person[] people = {new Person(5, "Люся"), new Person(32, "Ибрагим"),
                new Person(33, "Ичиго")};
        try {FileOutputStream fos = new FileOutputStream("People.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(people.length);
            for (Person person : people) {
                oos.writeObject(person);

        }
            oos.close();

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}