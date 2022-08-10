import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person(5,"Люся");
        Person person2 = new Person(32,"Ибрагим");
        Person[] people = {new Person(5,"Люся"), new Person(32,"Ибрагим"),
                new Person(33,"Ичиго")};

        FileOutputStream fos = new FileOutputStream("People");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Person person: people){
            oos.writeInt(people.length);

            oos.writeObject(person);
        }
    }
}
