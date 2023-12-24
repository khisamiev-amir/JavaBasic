package Collections.Set;

import java.util.HashSet;
import java.util.Set;
//элементы не отсортированы, структура данных похожа на список, нужен для уникальных списков
public class MainHashSet {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        name.add("Artem");
        name.add("Artem1");
        name.add("Artem");
        name.add("artem");
        System.out.println(name);

    }
}
