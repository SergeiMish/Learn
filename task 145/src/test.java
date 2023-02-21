import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile");
        PrintWriter pw = new PrintWriter(file);

        pw.println(344);
        pw.println("aawef333330");

        pw.close();
    }
}
