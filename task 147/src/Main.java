import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(new FileReader("test"));
        ArrayList<String> data = new ArrayList<>() ;
        while(scan.hasNextLine()){
            data.add(scan.nextLine());
        }
        System.out.println(data + "\n");

    }
}
