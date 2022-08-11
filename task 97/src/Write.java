import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {
    public static void main(String[] args) {
        Person[] people = {new Person(5, "Люся"), new Person(32, "Ибрагим"),
                new Person(33, "Ичиго")};
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("People.bin")))
        {
            oos.writeObject(people);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}