import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TestFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Ку ку йопта");
        pw.println("Строка 2");
        pw.close();

    }
}
