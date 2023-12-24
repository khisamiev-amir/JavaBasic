package StreamApi.HomeWork2203;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWork2203Main {
    public static void main(String[] args) {
        List<Fruits> box = new ArrayList<>();
        box.add(new Fruits("синий",8));
        box.add(new Fruits("красный",7));
        box.add(new Fruits("желтый",5));
        box.add(new Fruits("оранжевый",6));
        box.add(new Fruits("красный",5));
        List<Fruits>qwe = box.stream().sorted().collect(Collectors.toList());
        System.out.println(qwe);
        List<String> wer = qwe.stream().map(asd->asd.getColor()).distinct().collect(Collectors.toList());
        System.out.println(wer);
//        List<Fruits>qwe = box.stream().sorted().forEach(fruits -> System.out.println(fruits.getColor()));

    }
}
