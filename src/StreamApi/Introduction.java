package StreamApi;

import Basic.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.*;

import static java.util.Arrays.stream;

public class Introduction {
    public static void main(String[] args) {
        Integer[] a = new Integer[11]; // Stream<Integer>
        int[] c = new int[10]; // IntStream -> Stream<Integer> : boxed()
        double[] d = new double[10]; // DoubleStream
        int b = 0;

        for (int i = 0; i < 11; i++) {
            a[i] = i;
        }

//        for (int i = 0; i < a.length; i++) {
//            if (i % 2 != 0) {
//                b++;
//            }
//        }
//        System.out.println(b);
        List<Integer> l = new ArrayList<>();
        l.stream();
        String[] s = {"one", "two"};

        System.out.println(IntStream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(i -> i % 2 != 0).count());
        // filter(i->i%2!=0) - промежуточный
        // .count() - терминальный
        System.out.println(Stream.concat(Arrays.stream(a), Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        List<String> ss = new ArrayList<>();

        System.out.println(Arrays.toString(Stream.concat(stream(s), Stream.of("слон", "one", "жираф")).distinct().toArray()));
        ss = Stream.concat(stream(s), Stream.of("слон", "one", "жираф")).distinct().collect(Collectors.toList());
        ss = ss.stream().filter(i -> i.length() <= 3).collect(Collectors.toList());
        System.out.println(ss);


    }
}
