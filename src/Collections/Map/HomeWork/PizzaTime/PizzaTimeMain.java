package Collections.Map.HomeWork.PizzaTime;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class PizzaTimeMain {
    public static TreeMap<String, TreeMap<String, Integer>> parser() throws IOException {
        TreeMap<String, TreeMap<String, Integer>> orders1 = new TreeMap<>();
        String fileName = "src/Collections/Map/HomeWork/список.txt";
        FileReader path = new FileReader(fileName);//возвращает путь к файлу
        BufferedReader scannerTemplate = new BufferedReader(path);
        String string1 = String.valueOf(scannerTemplate.readLine());
        while (string1 != null) {

            String[] words = string1.split(" ");
//            3. Нужно проверять перед тем, как записывать, есть уже такой ключ в словаре(фамилия)
            // если фолс, то
            if (!orders1.containsKey(words[0])) {
                orders1.put(words[0], new TreeMap<>());
                orders1.get(words[0]).put(words[1], Integer.valueOf(words[2]));
            } else {
                if (!orders1.get(words[0]).containsKey(words[1])) {
                    orders1.get(words[0]).put(words[1], Integer.valueOf(words[2]));

                } else {
                    orders1.get(words[0]).put(words[1], orders1.get(words[0]).get(words[1]) + Integer.valueOf(words[2]));
                }

            }
            // иначе
//            3.2. если есть проверить есть такой же ключ(название пиццы) у второй мапы
//            3.2.1. если нет, просто записать
//            3.2.2. есть вытащить количество и добавить текущее


            string1 = scannerTemplate.readLine();
        }
        return orders1;
    }
    /*план:
    1. Наверху реализована запись строк
    2. СОхраняются последние две, т.к. совпадения по ключу
    3. Нужно проверять перед тем, как записывать, есть уже такой ключ в словаре(фамилия)
    3.1. если нет, то добавить новую запись
    3.2. если есть проверить есть такой же ключ(название пиццы) у второй мапы
    3.2.1. если нет, просто записать
    3.2.2. есть вытащить количество и добавить текущее
    */

    public static void main(String[] args) throws IOException {
        TreeMap<String, TreeMap<String, Integer>> orders = parser();
        System.out.println(orders);
//        orders.put("Иванов", new TreeMap<>());
//        orders.get("Иванов").put("Пепперони", 1);
//        orders.put("Петров", new TreeMap<>());
//        orders.get("Петров").put("Де-Люкс", 1);
//        orders.put("Иванов", new TreeMap<>());
//        orders.get("Иванов").put("Мясная", 2);
//        orders.put("Иванов", new TreeMap<>());
//        orders.get("Иванов").put("Мексиканская", 3);
//        orders.put("Иванов", new TreeMap<>());
//        orders.get("Иванов").put("Пепперони", 2);
//        orders.put("Петров", new TreeMap<>());
//        orders.get("Петров").put("Интересная", 5);
    }
}
