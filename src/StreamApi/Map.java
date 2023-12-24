package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Machine> listMachine = new ArrayList<>();
        listMachine.add(new Machine("e111tr", 2010));
        listMachine.add(new Machine("y222yy", 2020));
        listMachine.add(new Machine("d888fa", 2006));
        for (Machine a: listMachine)
              {
                  System.out.println(a.getNumber());
        }
        List<String> h = listMachine.stream().map(a -> a.getNumber()).collect(Collectors.toList());
        listMachine.stream().forEach(System.out::println);
        System.out.println(listMachine);

        System.out.println(listMachine.stream().noneMatch(a -> a.getNumber().contains("333")));
        System.out.println(listMachine.stream().skip(1).collect(Collectors.toList()));
//        System.out.println(listMachine.stream().sorted().collect(Collectors.toList()));
        System.out.println(listMachine.stream().sorted((o1, o2) -> o1.getDate().compareTo(o2.getDate())).collect(Collectors.toList()));
        System.out.println(listMachine.stream());
    }
}
