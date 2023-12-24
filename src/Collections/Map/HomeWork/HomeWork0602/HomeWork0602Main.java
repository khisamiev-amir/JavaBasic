package Collections.Map.HomeWork.HomeWork0602;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class HomeWork0602Main {
    public static void reader() throws IOException {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String fileName = "src/Collections/Map/HomeWork/HomeWork0602/пример.txt";
        FileReader path = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(path);
        String string = bufferedReader.readLine();
        String[] splitString = string.split(" ");
        for (String a : splitString
        ) {
            if (!treeMap.containsKey(a)) {
                treeMap.put(a, 0);
                System.out.print(a + " ");
            } else {
                treeMap.put(a, treeMap.get(a) + 1);
                System.out.print(a + "_" + treeMap.get(a) + " ");
            }
        }

    }

    public static void main(String[] args) throws IOException {
        reader();
    }
}
