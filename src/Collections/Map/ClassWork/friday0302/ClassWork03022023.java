package Collections.Map.ClassWork.friday0302;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class ClassWork03022023 {
    public static void dictionaryGenerated() throws IOException {
        TreeMap<Integer, Integer> orders1 = new TreeMap<>();
        String fileName = "src/Collections/Map/ClassWork/friday0302/числа.txt";
        FileReader path = new FileReader(fileName);//возвращает путь к файлу
        BufferedReader scannerTemplate = new BufferedReader(path);
        String string1 = String.valueOf(scannerTemplate.readLine());
        for (int i = 0; i < string1.length(); i++) {
//            Integer a = Character.getNumericValue(string1.charAt(i));
            Integer a = Integer.parseInt(String.valueOf(string1.charAt(i)));
            orders1.put(a, 0);

        }
        System.out.println(orders1);
        for (int i = 0; i < string1.length(); i++) {
            Integer a = Integer.parseInt(String.valueOf(string1.charAt(i)));
            orders1.put(a, orders1.get(a)+1);
        }
        System.out.println(orders1);
    }
    public static void main(String[] args) throws IOException {
        dictionaryGenerated();
    }
}
