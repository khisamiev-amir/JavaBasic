package Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainHashMap {
    public static void main(String[] args) {



        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Kolya", 12345);
        phoneBook.put("Kolyaa", null);
        System.out.println(phoneBook.get("Kolya"));
        System.out.println(phoneBook.containsKey("Kolya"));

        Map<String, Map<String, Integer>> pb2 = new HashMap<>();

    }
}
