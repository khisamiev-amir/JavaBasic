package StreamApi.ClassWork2203;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClassWorkMain {
    public static void main(String[] args) {
        List<Area> area = new ArrayList<>();
        area.add(new Area("Московский", new ArrayList<String>() {
            {
                add("ЯGeeks");
                add("ЯFor");
                add("ЯGeeksasd");
            }
        }));
        area.add(new Area("Приволжский", new ArrayList<String>() {
            {
                add("Пётр");
                add("Вася");
                add("Дася");
            }
        }));
        // rrr -> 1
        System.out.println(area.stream().map(rrr -> rrr.getPeoples().stream().sorted().collect(Collectors.toList())).collect(Collectors.toList()));

        // rrr -> 1,2,3,4,5
        System.out.println(area.stream().flatMap(rrr -> rrr.getPeoples().stream().sorted()).collect(Collectors.toList()));

        System.out.println(area.stream().map(rrr -> new ArrayList<String>() {{
            add(rrr.getName());
            add(rrr.getPeoples().stream().sorted().findFirst().toString());
        }}).collect(Collectors.toList()));

    }
}
