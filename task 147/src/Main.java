import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
            ArrayList<Integer> time = new ArrayList<>();
            int result;
            String str;
            FileReader file = new FileReader("input.txt");
            Scanner sc = new Scanner(file);
            str = sc.nextLine();
            StringTokenizer st = new StringTokenizer(str, " ");
            while (st.hasMoreTokens()) {
                time.add(Integer.valueOf(st.nextToken()));
            }
            result = (time.get(1) > time.get(0)) ? time.get(1) - time.get(0) : 12 + time.get(1) - time.get(0);
            FileWriter fileOut = new FileWriter("output.txt");
            fileOut.write(String.valueOf(result));
            fileOut.close();
        }
    }

