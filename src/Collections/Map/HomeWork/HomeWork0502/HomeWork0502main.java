package Collections.Map.HomeWork.HomeWork0502;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

public class HomeWork0502main {
    public static TreeMap<String, TreeMap<String, Integer>> clientsAndOrders() throws IOException {
        TreeMap<String, TreeMap<String, Integer>> clientsAndOrders = new TreeMap<>();
        String fileName = "src/Collections/Map/HomeWork/HomeWork0502/Продажи.txt";
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string1 = bufferedReader.readLine();
        while (string1 != null) {
            String[] words = string1.split(" ");
            clientsAndOrders.put(words[0], new TreeMap<>());
            string1 = bufferedReader.readLine();
        }
        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);
        string1 = bufferedReader.readLine();
        while (string1 != null) {
            String[] words = string1.split(" ");
            if (!clientsAndOrders.get(words[0]).containsKey(words[1])) {
                clientsAndOrders.get(words[0]).put(words[1], Integer.valueOf(words[2])); // parseInt -> int; valueOf -> Integer
            } else {
                clientsAndOrders.get(words[0]).put(words[1], clientsAndOrders.get(words[0]).get(words[2]) + 1);
            }
            string1 = bufferedReader.readLine();
        }
        return clientsAndOrders;
    }

    public static void printer(TreeMap<String, TreeMap<String, Integer>> result) {
        for (String s: result.keySet()
             ) {
            System.out.println(s);
            for (String r: result.get(s).keySet()
                 ) {
                System.out.println(r+" "+result.get(s).get(r));
            }

        }
    }

    public static void main(String[] args) throws IOException {
        TreeMap<String, TreeMap<String, Integer>> result = clientsAndOrders();
        printer(result);


    }
}
