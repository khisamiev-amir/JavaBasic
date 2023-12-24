package StreamApi.HomeWork1103;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

public class HomeWork1103Main {
    private static String randomString() {
        Random r = new Random();
        String str = "";
//        for (int i = 0; i < (r.nextInt(19) + 1); i++) {
        for (int i = 0; i < 10; i++) {
            int t = r.nextInt(26);
            str = str + (char) (t + 'A');
        }


        return str;
    }

    private static List<String> initialiseList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String s = randomString();
            list.add(s);
        }
        return list;
    }


    public static void main(String[] args) {

        List<String> str = initialiseList();
        List<String> str1 = initialiseList();
        System.out.println(str);

        str1=  Stream.concat(str.stream().filter(i->i.toLowerCase().contains("a")).filter(i->!i.toLowerCase().contains("с")),str.stream().filter(i->i.toLowerCase().contains("c"))).limit(2).collect(Collectors.toList()) ;
        System.out.println(str);

        System.out.println(str.stream().max(Comparator.comparingInt(String::length)));


    }
}
