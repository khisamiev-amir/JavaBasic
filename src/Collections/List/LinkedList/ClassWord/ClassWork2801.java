package Collections.List.LinkedList.ClassWord;

import java.util.*;

public class ClassWork2801 {
    public static TreeMap<String, Integer> createDictionary(String text) {
        TreeMap<String, Integer> dictionary = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (dictionary.containsKey(String.valueOf(text.charAt(i)))) {
                dictionary.put(String.valueOf(text.charAt(i)), dictionary.get(String.valueOf(text.charAt(i))) + 1);
            } else {
                dictionary.put(String.valueOf(text.charAt(i)), 1);
            }
        }

        System.out.println(dictionary);

        return dictionary;
    }

    public static TreeMap<String, Integer> invertableDictionary(TreeMap<String, Integer> dictionary) {
        TreeMap<Integer, ArrayList<String>> invertableDictionary1 = new TreeMap<>();
        TreeSet<Integer> treeSet1 = new TreeSet<>(dictionary.values());
        for (Integer a : treeSet1) {
            invertableDictionary1.put(a, new ArrayList<String>());
        }
        System.out.println(invertableDictionary1);

        for (String k : dictionary.keySet()) {
            Integer v = dictionary.get(k);

            invertableDictionary1.get(v).add(k);
        }
        System.out.println(invertableDictionary1);
        return dictionary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        TreeMap<String, Integer> dictionary = createDictionary(text);
        TreeMap<String, Integer> invertableDictionary2 = invertableDictionary(dictionary);

//        System.out.println("a_" + a.toString());


    }
}
