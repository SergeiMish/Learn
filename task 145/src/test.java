import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        class Person{
            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public String toString(){
                return id + ":" + name;
            }
        }
    }
}
