import java.io.*;

public class ReadObjects {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("people.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person1 = (Person) ois.readObject();
        Person person2 = (Person) ois.readObject();
        System.out.println(person1);
        System.out.println(person2);
        ois.close();


    }
}
