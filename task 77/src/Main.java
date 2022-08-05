import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lines;
        lines = new ArrayList<>(Files.readAllLines(Paths.get("Tekst")));
        for (String name: lines){
            System.out.println(name);
        }
    }
    }

