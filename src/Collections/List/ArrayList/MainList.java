package Collections.List.ArrayList;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        // List -> ArrayList, LinkedList

        List<String> people = new ArrayList<>();
        people.add(0, "Вася");
        people.add("Коля");
        people.add("Вася");
        people.set(2,"Дима");
//        System.out.println(people);
//        System.out.println(people.size());
//        System.out.println(people.get(0));
//        System.out.println(people.contains("Вася"));
//        for (int i = 0; i != people.size() ; i++) {
//            System.out.println(people.get(i));
//
//        }
//        people.remove("Вася");

//        System.out.println(people.indexOf("Вася"));
        System.out.println(people);
        System.out.println(people.subList(0,1));

        for (String name: people) {
            System.out.println(name);
        }
    }
}
