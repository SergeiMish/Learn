package ru.yandex.practicum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practicum {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        while (br.ready()) {
            int count = 0;
            String name = br.readLine();
            if (name.equals(br.readLine())) {
                count++;
                frequencyMap.put(name, count);
            }
            System.out.println(name + ": " + count);
        } reader.close();
    }


        // читайте файл построчно и сразу обновляйте frequencyMap.

        // выведите результат в формате "<буква>: <количество>".

    }