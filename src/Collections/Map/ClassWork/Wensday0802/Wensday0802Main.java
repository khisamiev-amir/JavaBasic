package Collections.Map.ClassWork.Wensday0802;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Wensday0802Main {

    public static void detectedFirstName() throws IOException {
        String path = "src/Collections/Map/ClassWork/Wensday0802/Ученики.txt";
        FileReader file = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(file);
        String line = bufferedReader.readLine();
        line = bufferedReader.readLine();
        String firstStudent = "1";
        HashMap<String, String> hashMap = new HashMap<>();
        while (line != null) {
            String[] words = line.split(" ");
            hashMap.put(words[1], words[0]);
            line = bufferedReader.readLine();


        }
        for (String s: hashMap.keySet()
             ) {

            if(!hashMap.containsValue(s)){
                firstStudent = s;
            }
        }
        System.out.println(firstStudent);
        for (int i = 0; i <= hashMap.size(); i++) {
            System.out.println(hashMap.get(firstStudent));
            firstStudent = hashMap.get(firstStudent);

        }

    }

    public static void main(String[] args) throws IOException {
        detectedFirstName();
        /*
        1. найти первого студента и сохранить
        2. после этого создать hashMap, в котором второй студент в паре будет ключом, а первый значением
        3. вывести из первого пункта имя, и просто значения из hashMap
         */
    }
}
