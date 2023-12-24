package StreamApi.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.*;

public class Task1Main {
    public static void main(String[] args) {
        Random random = new Random();
        // -100 - 100 -> randint(200) - 100
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(200) - 100);

        }

        System.out.println(list);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list4= new ArrayList<>();
        list1 = list.stream().filter(i -> i % 10 == 7).collect(Collectors.toList());//просто запомнить, что если надо сохранить получившийся поток в список,
        // то использовать класс Collectors, метод toList (или другой какой есть)
        // list=list.stream().filter(i -> i%10==-7).collect(Collectors.toList());
        list = Stream.concat(list.stream().filter(i -> i % 10 == 7), list.stream().filter(i -> i % 10 == -7)).collect(Collectors.toList());//статический метод - это метод который вызывается из класса.
        System.out.println(list);
        List<Integer> list3 = new ArrayList<>();
        list.stream().forEach(a -> System.out.println(a * 2));
        System.out.println(list.stream().findAny());
        System.out.println(list.stream().limit(3).collect(Collectors.toList()));


    }
}
