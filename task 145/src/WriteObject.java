
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person("Петр",25);
        Person person2 = new Person("Мария", 22);
        Person[] people = {
        new Person("Петр",25),new Person("Мария", 22), new Person("Эдуард", 40)
                , new Person("Морис - кот", 5 )};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
