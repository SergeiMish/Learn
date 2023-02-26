
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("test");

        int x;

            while ((x = fileReader.read())!= -1){

                System.out.println(x);


        }



    }
}
